package Recurrision.Array;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        int arr[]={1,21,3,4,3,5,6};
        int target=3;
        System.out.println(findElementLinear(arr,target,0));
        int result=findElementIndex(arr,target,0);
        System.out.println(result);
        findALL(arr,target,0);
        System.out.println(listhi);
    }



    private static boolean findElementLinear(int[] arr,int target, int index) {
        if(index==arr.length-1){
            return false;
        }
        return arr[index]==target || findElementLinear(arr,target,index+1);
    }

    //find index
    private static int findElementIndex(int[] arr,int target, int index) {
        if(index==arr.length-1){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
            return findElementIndex(arr,target,index+1);


    }

    static ArrayList<Integer> list=new ArrayList<>();
    private static void findALL(int[] arr, int target, int index) {
        if(index==arr.length-1){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
        findALL(arr,target,index+1);

    }
}
