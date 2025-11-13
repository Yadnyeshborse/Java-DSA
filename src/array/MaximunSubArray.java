package array;

public class MaximunSubArray {
    public static void main(String[] args) {
        int  nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either start fresh at nums[i], or extend the previous subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}
