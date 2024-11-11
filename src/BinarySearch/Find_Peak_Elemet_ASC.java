package BinarySearch;
//https://leetcode.com/problems/find-peak-element/
//here we are assuming peak elemet is at right side
public class Find_Peak_Elemet_ASC {
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        Find_Peak_Elemet_ASC o=new Find_Peak_Elemet_ASC();
        System.out.println(o.findPeakElement(nums));

    }
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If the mid element is less than the next element, the peak is on the right
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                // Otherwise, the peak is on the left (or the mid itself is the peak)
                end = mid;
            }
        }

        // Start and end converge to the peak element index
        return start;
    }


}
