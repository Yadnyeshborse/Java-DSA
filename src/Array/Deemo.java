package Array;

import java.util.Arrays;

public class Deemo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int n=2;
        for (int j=0;j<n;j++){
            int first=arr[0];
            for (int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];

            }
            arr[arr.length-1]=first;
        }
        System.out.println(Arrays.toString(arr));

    }
}
