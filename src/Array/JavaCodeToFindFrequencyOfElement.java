package Array;

import java.util.Arrays;

public class JavaCodeToFindFrequencyOfElement {
    public static void main(String[] args) {
        int[] arr={1, 2, 8, 3, 2, 2, 2, 5, 1};
        int visited=-1;
        int[] fr=new int[arr.length];
        for (int i=0;i<arr.length;i++){
           int count=1;
           for(int j=i+1;j<fr.length;j++){
               if (arr[i]==arr[j]){
                   count++;
                   fr[j]=visited;

               }
               if (fr[i]!=visited){
                   fr[i]=count;
               }
           }
        }

        //print the no

        for (int i=0;i<arr.length;i++){
            if(fr[i]!=visited){
                System.out.println(arr[i]+" "+fr[i]);
            }
        }
        System.out.println(Arrays.toString(fr));
    }
}
