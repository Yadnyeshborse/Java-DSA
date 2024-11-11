package Sort.CyclicSort;
//https://leetcode.com/problems/missing-number/description/
import java.util.Arrays;
//Given an array nums containing n distinct numbers in the range [0, n]
//here range is from 0 to n that why we did not do int correctindex=arr[i]-1
//https://leetcode.com/problems/first-missing-positive/submissions/1410811786/     similar
public class MissingNo {
    public static void main(String[] args) {
        int[] arr={3,2,0};
        cyclesort(arr);
        System.out.println(cyclesort(arr));
    }

    private static int cyclesort(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correctindex=arr[i];  //here it is different logic
            if (arr[i]<arr.length && arr[i]!=arr[correctindex]){  //arr[i]<arr.length
                swap(arr,i,correctindex);
            }else {
                i++;
            }

        }

        //check the missing index
        //here after sorting result will be [0,3,2]  need to find value here
        for(int index=0;index<arr.length;index++){
            if (arr[index]!=index){
                return index+1;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
