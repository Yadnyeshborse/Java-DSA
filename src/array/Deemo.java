package array;


import java.util.Arrays;

public class Deemo {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int[] merged = mergeSortedA(a, b);
        System.out.println("Merged Array: " + Arrays.toString(merged));


    }

    private static int[] mergeSortedA(int[] a, int[] b) {

        int i=0,j=0,k=0;
        int merge[]=new int[a.length+b.length];
        while (i<a.length && j<b.length) {
            merge[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
        }
        if (i<a.length){
            merge[k++]=a[i++];
        }
        if (j<b.length){
            merge[k++]=b[j++];
        }
        return merge;
    }
}