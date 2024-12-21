package Recurrision.Array;

public class SearchInCircularArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};
        int target=5;
        System.out.println(search(arr,target,0,arr.length-1));

    }

    static int search(int[] arr,int target,int start,int end){

        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }

        if (arr[start]<arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return search(arr, target, start, mid-1);  //if array is sorted than this condition is enough
            }else {
                return search(arr,target,mid+1,end);  //if not sorted than this condition is needed ex if tarhet is 2 than need this
            }
        }
        if (target>=arr[mid]&&target<arr[end]){
            return search(arr,target,mid+1,end);
        }

        return search(arr,target,start,mid-1);

    }
}
