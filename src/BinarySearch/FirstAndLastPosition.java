package BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
import java.util.Arrays;

public class FirstAndLastPosition {
    public boolean serachno;

    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,6,7,8};
        int target=2;
        FirstAndLastPosition no=new FirstAndLastPosition();

        System.out.println(Arrays.toString(no.findno(arr, target)));
    }

    public int[] findno(int[] arr,int target){
        int[] ans={-1,-1};
        int start=search(arr,target,true);
        int end=search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return  ans;
    }

    public int search(int[] arr,int target,boolean fistStartIndex){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }else {
                ans=mid;
                if(fistStartIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;

    }

}
