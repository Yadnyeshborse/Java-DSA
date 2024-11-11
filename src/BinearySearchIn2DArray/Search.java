package BinearySearchIn2DArray;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int target=9;
        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int[] search(int[][] arr,int target){
        int r=0;
        int col=arr.length-1;
        while (r<arr.length && col>=0){
            if (arr[r][col]==target){
                return new int[]{r,col};
            } else if (arr[r][col]<target) {
                r++;
            }else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
