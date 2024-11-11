package Array;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr={1, 2, 8, 3, 2, 2, 2, 5, 1};
        int flagged=-1;
        int[] fr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<fr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                    fr[j]=flagged;
                }
                if (fr[i]!=flagged){
                    fr[i]=count;
                }
            }
        }
        for (int h=0;h<fr.length;h++){
            if (fr[h]!=flagged){
                System.out.println(arr[h]+" "+fr[h]);
            }
        }
        System.out.println(Arrays.toString(fr));
    }
}
