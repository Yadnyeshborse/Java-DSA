package BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-numsay/description/
//step 1=find pivot
//step 2=search in first half
//step 3 search in second half
//012345
//after first rotation
//501234
//after second rotation
//450123
//will not work in duplicate array
public class SerchInRoatedArray {
    public static void main(String[] args) {
        int[] nums={3,4,5,6,7,0,1,2};
        int target=1;
        SerchInRoatedArray obj=new SerchInRoatedArray();
        int result = obj.search(nums, target);
        System.out.println(result);

    }
    public int search(int[] nums,int target){
        int pivot=findPivot(nums);
        //if we dont fount piovt than numsay is not rotated
        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        };
        // If target is at the pivot
        if (nums[pivot] == target) {
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    public int binarySearch(int[] nums,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            } else if(nums[mid]<target) {
                end=mid-1;
            }else {
                start=mid+1;

            }
        }
        return -1;
    }

    private int findPivot(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if (mid>start &&  nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            if (nums[start]<nums[mid]){
                start=mid+1;
            }
        }
        return -1;
    }
}
