package BinearySearchIn2DArray;
//https://leetcode.com/problems/search-a-2d-matrix/description/

import java.util.Arrays;

public class SearchIn2DMatrixL {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,5,7},{10,11,16,20},{23,30,34,60}
        };
        int target=60;
        System.out.println((search(arr, target)));
    }
    public static boolean search(int[][] arr,int target){
        int row=0;
        int col=arr[0].length-1;
        while (row<arr.length&& col>=0){
            if (arr[row][col]==target){
                return true;
            } else if (arr[row][col]>target) {
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
}
