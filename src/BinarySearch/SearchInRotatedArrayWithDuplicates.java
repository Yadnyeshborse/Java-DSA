package BinarySearch;

public class SearchInRotatedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] nums = {2, 9, 2, 2, 2};
        int target = 9;
        SearchInRotatedArrayWithDuplicates obj = new SearchInRotatedArrayWithDuplicates();
        int result = obj.search(nums, target);
        System.out.println(result);
    }

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // If we don't find a pivot, then the array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If the target is at the pivot
        if (nums[pivot] == target) {
            return pivot;
        }

        // Search in the sorted halves
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Handle duplicates: reduce search space when elements are the same
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            // If the left part is sorted
            else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            }
            // If the right part is sorted
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
