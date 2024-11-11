package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1395240549/
//here we are assuming that it is sorted for first half it is in asc order and for second half it is in dec order
public class Find_Peak_Element_Mountain_Array {
    public static void main(String[] args) {
        int nums[]={1,3,5,7,4,3,2};
        Find_Peak_Elemet_ASC o=new Find_Peak_Elemet_ASC();
        System.out.println(o.findPeakElement(nums));
    }

    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        //here we are not assuming equal condition
        while (start < end) {
            int mid = start + (end - start) / 2;

            // If the mid element is less than the next element, the peak is on the right
            if (nums[mid] < nums[mid + 1]) {
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
