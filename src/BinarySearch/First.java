package BinarySearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] arr ={5,7,7,8,8,10};
        int target=8;
        First obj=new First();
        System.out.println(Arrays.toString(obj.serchno(arr,target)));
    }
    public int[] serchno(int[] arr,int target){
        int[] ans={-1,-1};
        int start=findno(arr,target,true);
        int end=findno(arr,target,false);
        ans[0]=start;
        ans[1]=end;

        return ans;
}
public int findno(int[] arr,int target,boolean fistindex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        //here start need to be less tha and equal to error otherwise give error
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
                ans=mid;
                if(fistindex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }

        return ans;
}
}







