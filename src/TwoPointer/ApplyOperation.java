package TwoPointer;

import java.util.Arrays;
//https://leetcode.com/problems/apply-operations-to-an-array/description/
public class ApplyOperation {
    public int[] applyOperations(int[] nums) {
        // Step 1: Apply the operations
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Step 2: Move non-zeros to the front
        int j = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != 0) {
                nums[j++] = nums[k];
            }
        }

        // Step 3: Fill remaining with 0
        while (j < nums.length) {
            nums[j++] = 0;
        }

        return nums;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1, 1, 0};
        ApplyOperation obj = new ApplyOperation();
        System.out.println(Arrays.toString(obj.applyOperations(arr)));
    }
}
