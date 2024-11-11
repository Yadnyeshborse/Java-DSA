package Sort.CyclicSort;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1409475019/


public class MissingNoProm2 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 1, 0};

        System.out.println(findMissingNumbers(arr));
    }

    private static List<Integer> findMissingNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // Correct index for current number
            // Check if the number is within bounds and not already in correct position
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        //missing no =index+1
        List<Integer> ans = new ArrayList<>();
        // Identify missing numbers
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    public static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
