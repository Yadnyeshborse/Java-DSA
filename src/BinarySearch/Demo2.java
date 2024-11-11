package BinarySearch;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int target=9;
        Demo2 obj=new Demo2();
        int result=obj.binearysearh(arr,target);
        System.out.println(result);
    }

    private int binearysearh(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }else {
                return mid;
            }
        }
        return -1;
    }


}
