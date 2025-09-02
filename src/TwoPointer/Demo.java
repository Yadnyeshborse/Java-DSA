package TwoPointer;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int arr[] = {2,4,9,-1,0,-5,-5, 100,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target=2;
        int result=findPosition(arr,target);
        System.out.println(result);

    }

    private static int findPosition(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]<target){
                end--;
            }else if (arr[mid]>target){
                start++;
            }else {
                return mid;
            }
        }


        return -1;
    }
}
