package BinarySearch;
//while chnaging value it can go out of box index so we need to be safe
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int target=16 ;
        InfiniteArray no=new InfiniteArray();

        System.out.println(no.findMaxInInfiniteArray(arr,target));

    }

    public int findMaxInInfiniteArray(int[] arr,int target){
        int start=0;
        int end=start+1;
        while (target>arr[end]){
            int newStart=end+1;
            //end=end+(end-start+1)*2;
            //modifies logic in order to handel array out of box error
            end = Math.min(end + (end - start + 1) * 2, arr.length - 1);
            start=newStart;
        }

        return findno(arr,target,start  ,end);
    }

    public int findno(int[] arr,int target,int start,int end){
        //int start=0;
        //int end=arr.length-1;
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
        return -1;
    }
}
