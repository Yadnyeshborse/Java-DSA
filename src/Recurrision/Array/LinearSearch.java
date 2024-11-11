package Recurrision.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,5,6};
        int targget=2;
        System.out.println("To check if it is present or not "+find(arr,targget,0));
        System.out.println("To check index  "+findIndex(arr,targget,0));
        System.out.println("To check index from last  "+findIndexLast(arr,targget,arr.length-1));
        findAllIndex(arr,3,0);
        System.out.println("All indices of target 3: " + list); // Output: [2]

        ArrayList<Integer> ans=findAllIndexList(arr,targget,0,new ArrayList<>());
        System.out.println("List Ans"+ans);

    }



    //if we want to find value is present or not
    static boolean find(int[] arr,int target,int index){
        if (index==arr.length){
            return false;
        }
        // If the current element matches the target, return true
        if (arr[index] == target) {
            return true;
        }
        return find(arr,target,index+1);
    }


    //to find index
    static int findIndex(int[] arr,int target,int index){
        if (index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return  index;
        }else {
            return findIndex(arr,target,index+1);
        }
    }

    //search from last index
    static int findIndexLast(int[] arr,int target,int index){
        if (index==-1){
            return -1;
        }
        if (arr[index]==target){
            return  index;
        }else {
            return findIndexLast(arr,target,index-1);
        }
    }


    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return; // Base case: If we reach the end, stop.
        }
        if (arr[index] == target) {
            list.add(index); // If the current element matches the target, add the index to the list.
        }
        findAllIndex(arr, target, index + 1); // Search in the remaining array.
    }

    private static ArrayList<Integer> findAllIndexList(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexList(arr, target, index + 1, list);
    }




}
