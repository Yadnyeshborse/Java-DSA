package Array;

import java.util.Arrays;

public class RotateArrayToRight {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
//        int n=1;
//        for (int i=0;i<n;i++){
//            int last=arr[arr.length-1];
//            for(int j=arr.length-1;j>0;j--){
//                arr[j]=arr[j-1];
//
//            }
//            arr[0]=last;
//        }
//        System.out.println(Arrays.toString(arr));

        int n=2;
        for (int i = 0; i <n ; i++) {
            int last=arr[arr.length-1];
            for (int j = arr.length-1; j >0 ; j--) {
                arr[j]=arr[j-1];
            }
            arr[0]=last;

        }
        System.out.println(Arrays.toString(arr));
    }
}
