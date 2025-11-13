package array;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
//        int res[]=new int[nums.length];
//
//        for (int i = 0; i <nums.length ; i++) {
//            int prod=1;
//            for (int j = 0; j <nums.length ; j++) {
//                if (i!=j){
//                    prod*=nums[j];
//                }
//            }
//            res[i]=prod;
//        }
//        System.out.println(Arrays.toString(res));




        int n = nums.length;

        // 1. Array to store product of all elements to the left of i
        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // 2. Array to store product of all elements to the right of i
        int[] right = new int[n];
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // 3. Final answer: multiply left[i] and right[i]
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }

        System.out.println(Arrays.toString(ans));

    }
}
