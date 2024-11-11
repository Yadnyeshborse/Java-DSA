package BinarySearch;

public class Oder_Agnostic_binary_Search
{
    //when we are not sure whether array is in asc order sorted or desc order sorted
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int target=6;
        Oder_Agnostic_binary_Search no=new Oder_Agnostic_binary_Search();

        System.out.println(no.findindexthatcanbeascordsc(arr,target));

    }

    public int findindexthatcanbeascordsc(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        boolean isASC=arr[start]<arr[end];

        while (start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isASC){
                if(target<arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;

                }
            }else {
                if (target>arr[mid]){
                    end=mid-1;
                } else  {
                    start=mid+1;

                }
            }

        }


        return -1;
    }
}
