package Array;

import java.util.Arrays;

public class JavaCodeToFindFrequencyOfElement {
    public static void main(String[] args) {
        int[] arr={1, 2, 8, 3, 2, 2, 2, 5, 1};
        int freq[]=new int[arr.length];
        int visited=-1;
        for (int i=0;i<arr.length;i++){
            if (freq[i]==visited){
                continue;
            }
            int count=1;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                    freq[j]=visited;
                }
            }
            freq[i]=count;
        }

        for (int k=0;k<freq.length;k++){
            if (freq[k]>1){
                System.out.println(arr[k]+"="+freq[k]);
            }
        }



    }
}
