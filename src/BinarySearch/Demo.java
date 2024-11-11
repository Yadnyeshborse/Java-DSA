package BinarySearch;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int arr[]={5,1,2,3,4,6,7,8};
        int target=6;
        Demo d=new Demo();
        System.out.println(d.findsno(arr,target));

    }
    public int findsno(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;

            } else if (target<arr[mid]) {
                end=mid-1;

            }else {
                return mid;
            }
        }
        return -1;
    }
}
