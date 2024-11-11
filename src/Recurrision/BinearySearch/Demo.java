package Recurrision.BinearySearch;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};  // Array must be sorted
        int target = 10;  // Element to search for
        int result = binarySearch(arr, target, 0, arr.length - 1);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Recursive Binary Search function
    static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;  // Base case: element is not found
        }

        int mid = left + (right - left) / 2;  // Find the middle index

        // Check if the target is at the mid index
        if (arr[mid] == target) {
            return mid;
        }

        // If target is smaller than mid, search in the left subarray
        if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1);
        }

        // If target is larger than mid, search in the right subarray
        return binarySearch(arr, target, mid + 1, right);
    }
}
