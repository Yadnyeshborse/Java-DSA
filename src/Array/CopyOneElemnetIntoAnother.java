package Array;

import java.util.Arrays;

public class CopyOneElemnetIntoAnother {
    public static void main(String[] args) {
        int arr[]={12,2,22,56,7,8,78};
        int[] tud=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            tud[i]=arr[i];
        }
        System.out.println(Arrays.toString(tud));
    }
}
