package TwoPointer;

import java.util.Arrays;
//https://leetcode.com/problems/move-zeroes/submissions/1738598140/
public class MoveZeroToEnd {
    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};

        int j = 0; // next write position for a non-zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {          // avoid extra writes when i == j
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
