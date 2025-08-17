package TwoPointer;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class Remove_duplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[]={1,1,2};
        System.out.println(ReturnUniqueCount(arr));
    }

    private static int ReturnUniqueCount(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}

//Why j = 1 initially?
//The first element (nums[0]) is always unique (since the array is sorted).
//That means the unique subarray already starts with nums[0].
//So we don’t need to move anything yet, but the next unique element must be written at index 1.
//Therefore, we start j = 1.
