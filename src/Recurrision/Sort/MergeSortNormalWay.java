package Recurrision.Sort;

import java.util.Arrays;

public class MergeSortNormalWay {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        arr=mergeSortO(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergeSortO(int[] arr) {
        if (arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSortO(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSortO(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeArray(left,right);
    }

    private static int[] mergeArray( int[] first, int[] last) {
        int mix[]=new int[first.length+last.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length && j<last.length){
            if (first[i]<last[j]){
                mix[k]=first[i];
                i++;

            }else {
                mix[k]=last[j];
                j++;

            }
            k++;
        }
        while (i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j<last.length){
            mix[k]=last[j];
            j++;
            k++;
        }
        return mix;
    }
}
