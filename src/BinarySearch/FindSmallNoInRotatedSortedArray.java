package BinarySearch;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/1404649936/
//similar to CountTheNoOfTimesArrayIsRotated
//here we are find by using pivot we can also do it by binary search
public class FindSmallNoInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        FindSmallNoInRotatedSortedArray obj = new FindSmallNoInRotatedSortedArray();
        int result = obj.findRotationCount(arr);
        System.out.println("Smallest No is " + result );
    }

    private int findRotationCount(int[] arr) {
        // Find the pivot
        int pivot = findPivot(arr);
        // If there is no pivot, the array is not rotated
        if (pivot == -1) {
            return arr[0];
        }
        // Rotation count is pivot + 1
        return arr[pivot + 1];
    }

    private int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Adjust the search range
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
