package BinarySearch;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Demo d=new Demo();
        int nums[]={1,3,5,7,4,3,2};
        int target=1;
        int result = d.findsno(nums);

        System.out.println("Index of target " + result );

    }
    public int findsno(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]<arr[mid+1]){
                start=mid+1;
            }else {
                end=mid;
            }

        }
        return start;
    }
}
