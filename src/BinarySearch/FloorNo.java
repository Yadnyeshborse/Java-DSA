package BinarySearch;

public class FloorNo {
    public static void main(String[] args) {
        int arr[]={1,3,6,9,11,14,15,18};
        int target=13;
        FloorNo no=new FloorNo();
       //The floor of a number is the largest integer that is less than or equal to
        System.out.println(no.findno(arr,target));

    }

    public int findno(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }else {
                return mid;
            }
        }
        return end;
    }
}
