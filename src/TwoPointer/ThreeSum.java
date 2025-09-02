package TwoPointer;

import java.util.*;

//https://leetcode.com/problems/3sum/description/
public class ThreeSum {
    public static void main(String[] args) {

        ThreeSum obj = new ThreeSum();

        // Example test cases
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {0, 1, 1};
        int[] nums3 = {0, 0, 0};

        System.out.println(obj.threeSum(nums1)); // Expected: [[-1, -1, 2], [-1, 0, 1]]
        System.out.println(obj.threeSum(nums2)); // Expected: []
        System.out.println(obj.threeSum(nums3)); // Expected: [[0, 0, 0]]

    }

    public List<List<Integer>> threeSum(int[] nums) {
        // Edge case: If nums is null or has less than 3 elements, return empty result
        if (nums == null || nums.length < 3) return new ArrayList<>();

        // Step 1: Sort the array so we can apply the two-pointer technique
        Arrays.sort(nums);

        // Step 2: Use a Set to avoid duplicate triplets (since List equality checks element by element)
        Set<List<Integer>> set = new HashSet<>();

        // Step 3: Iterate through the array, fixing one element nums[i]
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;               // Left pointer just after i
            int right = nums.length - 1;    // Right pointer at the end

            // Step 4: Two-pointer traversal
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a triplet → add to the set
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;   // Move left pointer
                    right--;  // Move right pointer
                } else if (sum < 0) {
                    // If sum < 0 → increase sum by moving left pointer forward
                    left++;
                } else {
                    // If sum > 0 → decrease sum by moving right pointer backward
                    right--;
                }
            }
        }

        // Step 5: Convert set to list and return
        return new ArrayList<>(set);
    }
}
