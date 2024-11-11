package Sort.BubbledSort;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int arr[]={4,3,17,9};
        System.out.println(Arrays.toString(bubbledsort(arr)));
    }

    private static int[] bubbledsort(int[] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){     //here arr.length we are resducing array search part
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

