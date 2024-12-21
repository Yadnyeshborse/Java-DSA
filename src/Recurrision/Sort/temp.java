package Recurrision.Sort;

import java.util.Arrays;

public class temp {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int ans[]=mergeSortP(arr);
        for (int i:ans){
            System.out.print(i);
        }
    }

    private static int[] mergeSortP(int[] arr) {
        if (arr.length==1){
            return arr;
        }

        int mid=arr.length/2;
        int[] left=mergeSortP(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSortP(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeA(left,right);

    }

    private static int[] mergeA(int[] first, int[] second) {
        int i=0;
        int j=0;
        int k=0;
        int[] mix=new int[first.length+second.length];
        while (i<first.length && j<second.length){
            if (first[i]<second[j]){
                mix[k]=first[i];
                i++;
                k++;
            }else {
                mix[k]=second[j];
                j++;
                k++;
            }
        }
        while (i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;


    }
}
