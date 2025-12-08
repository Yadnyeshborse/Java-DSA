package binarySearch;


public class Demo {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};

        Demo obj = new Demo();
        int result = obj.findRotationCount(arr);

        System.out.println("Array is rotated " + result + " times.");
    }

    private int findRotationCount(int[] arr) {
        int pivot = findPivot(arr);
        if (pivot == -1) return 0;  // not rotated
        return pivot + 1;
    }

    private int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Pivot cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Decide which half to search
            if (arr[mid] >= arr[start]) {
                start = mid + 1; // search right
            } else {
                end = mid - 1;   // search left
            }
        }
        return -1;
    }
}
