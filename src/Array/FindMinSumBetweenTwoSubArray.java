package Array;

public class FindMinSumBetweenTwoSubArray {
    public static int findMinDifference(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int prefixSum = 0;
        int minDiff = Integer.MAX_VALUE;

        // We stop before the last element to ensure both subarrays are non-empty
        for (int i = 0; i < nums.length - 1; i++) {
            prefixSum += nums[i];
            int currentDiff = Math.abs(prefixSum - (totalSum - prefixSum));
            minDiff = Math.min(minDiff, currentDiff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr1 = {7 ,6 ,8 ,1 ,5};
        System.out.println(findMinDifference(arr1)); // Output: 1

//        int[] arr2 = {5, 11, 14, 10, 17};
//        System.out.println(findMinDifference(arr2)); // Output: 3
    }

}
