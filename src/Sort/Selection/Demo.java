package Sort.Selection;

import java.util.Arrays;

import static java.util.Collections.swap;

public class Demo {
    public static void main(String[] args) {
        int arr[]={7,3,17,9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for (int i=0;i<arr.length;i++){

            int last=arr.length-i-1;
            int maxNum=maxno(arr,0,last);
            swap(arr,maxNum,last);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static int maxno(int[] arr, int start, int end){
        int max=start;
        for (int i=0;i<=end;i++){
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
