package Sort.CyclicSort;

import java.util.Arrays;

public class Somo {
    public static void main(String[] args) {
        int[] arr={3,2,1,0};   //here we are stating from 0 so at second iteeration it will be -1 arr[o]-1=0-1=-1
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int i=0;
        while (i<arr.length){
       int correctind=arr[i];
       if (arr[i]<arr.length  && arr[i]!=arr[correctind]){
           swap(arr,i,correctind);
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
