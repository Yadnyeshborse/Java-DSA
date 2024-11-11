package Sort.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclesort(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correctindex=arr[i]-1;
            if (arr[i]!=arr[correctindex]){
                swap(arr,i,correctindex);
            }else {
                i++;
            }

        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
