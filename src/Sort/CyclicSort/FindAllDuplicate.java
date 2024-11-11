package Sort.CyclicSort;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 2};    //here we are not starting from 0

        System.out.println(findDuplicateNumbers(arr)); // Output: [2]
    }

    private static List<Integer> findDuplicateNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            // Swap the numbers to their correct position if they're not already there
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        //for duplicate arr[index]

        List<Integer> ans = new ArrayList<>();
        // Find all the numbers that are duplicates
        //after sorting result is [1,2,3,4,2]
        for (int index = 0; index < arr.length; index++) {
            // If the number is not in its correct position, it means it's a duplicate
            if (arr[index] != index + 1) {    //here it is not starting from 0 that why index+1
                ans.add(arr[index]);
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
