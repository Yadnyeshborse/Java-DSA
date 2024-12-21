package Recurrision.Array;

public class SearchCircularArrayDemo {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};
        int target=2;
        int result=findCircircularBinarySearch(arr,target,0,arr.length-1);
        System.out.println(result);
    }

    private static int findCircircularBinarySearch(int[] arr, int target, int start, int end) {
        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if (target==arr[mid]){
            return mid;
        }

        if (arr[start]<=arr[mid]){
            if (arr[start]<=target && arr[mid]>target){
                return findCircircularBinarySearch(arr,target,start,mid-1);
            }else {
                return findCircircularBinarySearch(arr,target,mid+1,end);
            }
        }
        if (arr[mid] <= arr[end]) {
            // Check if the target is within the range of the sorted right half
            if (arr[mid] < target && target <= arr[end]) {
                return findCircircularBinarySearch(arr, target, mid + 1, end);
            } else {
                return findCircircularBinarySearch(arr, target, start, mid - 1);
            }
        }
        return -1;
    }
}
