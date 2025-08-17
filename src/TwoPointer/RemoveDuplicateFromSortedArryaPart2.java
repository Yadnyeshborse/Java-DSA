package TwoPointer;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
public class RemoveDuplicateFromSortedArryaPart2 {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3};
        System.out.println(ReturnUniqueCountpart2(arr));
    }

    private static int ReturnUniqueCountpart2(int[] nums) {
        int j = 0; // pointer for result

        for (int i = 0; i < nums.length; i++) {
            // Always keep first two, or keep if different from element at j-2
            if (j < 2 || nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j; // new length
    }
}
