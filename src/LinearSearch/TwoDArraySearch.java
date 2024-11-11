package LinearSearch;

import java.util.Arrays;

public class TwoDArraySearch {
    public static void main(String[] args) {
        int arr[][]= {
                {23,12,6,7},
                {8,6,7},
                {90,2,34}
        };
        int target=6;
        int result[]=searchtwoDarray(arr,target);
        System.out.println(Arrays.toString(result));

    }

    public static int[] searchtwoDarray(int[][] arr, int target) {
        for(int row=0;row<arr.length;row++) {
            for(int col=0;col<arr[row].length;col++) {
                if(arr[row][col]==target) {
                    return new int[] {row,col};
                }

            }
        }

        return new int[]{-1,-1};
    }
}
