package Sort.BubbledSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={4,3,17,9};
        System.out.println(Arrays.toString(search(arr)));
    }
    public static int[] search(int[] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
