package TwoPointer;
//https://leetcode.com/problems/two-sum/description/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        //solu 1
//        int L=0,R=nums.length-1;
//        while (L<R){
//            int sum=nums[L]+nums[R];
//            if (target==sum){
//                return new int[]{L,R};
//            } else if (sum<target) {
//                L++;
//            }else {
//                R--;
//            }
//        }
//solu 2
//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = i+1; j <nums.length ; j++) {
//                if (nums[i]+nums[j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//
//        return new int[]{-1,-1};

        //solution 3
//what is array is unsorted this will ne usefull
        Map<Integer, Integer> map = new HashMap<>();
// 3 2 4
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement already exists in the map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Otherwise, store the current number with its index
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}

