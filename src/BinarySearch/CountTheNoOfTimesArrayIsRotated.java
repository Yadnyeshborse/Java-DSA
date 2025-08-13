package BinarySearch;
//here we fount pivot than we use pivot+1
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/


public class CountTheNoOfTimesArrayIsRotated {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        CountTheNoOfTimesArrayIsRotated obj = new CountTheNoOfTimesArrayIsRotated();
        int result = obj.findRotationCount(arr);
        System.out.println("Array is rotated " + result + " times.");
    }

    private int findRotationCount(int[] arr) {
        // Find the pivot
        int pivot = findPivot(arr);
        // If there is no pivot, the array is not rotated
        if (pivot == -1) {
            return 0;
        }
        // Rotation count is pivot + 1
        return pivot + 1;
    }

    private int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If mid is greater than the element after it,
            //Then mid is the pivot (largest element before the rotation).
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // If mid is smaller than the element before it,
            //Then mid - 1 is the pivot.
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
