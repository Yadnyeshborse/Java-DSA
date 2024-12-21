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
        System.out.println(list);
        ArrayList<Integer> listo= findALLByPassingList(arr,target,0,new ArrayList<>());
        System.out.println("After passing list "+listo);

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

    //______________________________________________________________________________________________


    private static ArrayList<Integer> findALLByPassingList(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index==arr.length){
            return list;
        }
        if (target==arr[index]){
            list.add(index);
        }

            return  findALLByPassingList(arr,target,index+1,list);

    }
}
