package Sort.CyclicSort;
//https://leetcode.com/problems/set-mismatch/description/
//used both concept of duplicate element and missing no
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find_Duplicate_And_Misiing_NO {
    public static void main(String[] args) {
        int arr[]={1,2,2,4};
        System.out.println(Arrays.toString(findDuplicateNumbers(arr)));
        
    }

    private static int[] findDuplicateNumbers(int[] arr) {
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


        for (int index = 0; index < arr.length; index++) {

            if (arr[index] != index + 1) {
                return  new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }


    public static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
