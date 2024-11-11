package BinarySearch;
//https://leetcode.com/problems/find-in-mountain-array/description/
//here we are sure that where peak element will lie in left side or right so we need to give min index here
//here we are using two approach Oder_Agnostic_binary_Search and Find_Peak_Element_Mountain_Array
public class Find_Peak_Element_In_Mountain_Array_1095 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        Find_Peak_Element_In_Mountain_Array_1095 obj=new Find_Peak_Element_In_Mountain_Array_1095();
        System.out.println(obj.search(arr,target));
    }
    public int search(int[] arr,int target){
        int peak=findPeakElement(arr);

        int result=findindexthatcanbeascordsc(arr,target,0,peak);
        if(result!=-1){
            return result;
        }
        return findindexthatcanbeascordsc(arr,target,target+1,arr.length-1);


    }

    public int findindexthatcanbeascordsc(int[] arr,int target,int start,int end){

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

    public int findPeakElement(int[] arrr) {
        int start = 0;
        int end = arrr.length - 1;

        //here we are not assuming equal condition
        while (start < end) {
            int mid = start + (end - start) / 2;

            // If the mid element is less than the next element, the peak is on the right
            if (arrr[mid] < arrr[mid + 1]) {
                start = mid + 1;
            } else {
                // Otherwise, the peak is on the left (or the mid itself is the peak)
                end = mid;   //here we dont do this because end=mid-1 mid can be possible answer
            }
        }

        // Start and end converge to the peak element index
        return start;   //or return end
    }
}
