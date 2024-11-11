package Sort.Selection;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int arr[]={7,3,17,9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int highest=findmaxno(arr,0,last);
            swap(arr,highest,last);
        }
    }

    private static void swap(int[] arr, int highest, int last) {
        int temp=arr[highest];
        arr[highest]=arr[last];
        arr[last]=temp;
    }

    private static int findmaxno(int[] arr, int start, int last) {
        int max=start;
        for (int k=0;k<=last;k++){
            if (arr[k]>arr[max]){
                max=k;
            }
        }
        return max;
    }


}
