package String;

import java.util.Arrays;

public class Find_minimun_maximum_occurance_of_each_frequency {
    public static void main(String[] args) {
        String str="ASNAAJDOKOPP" ;
        char[] coo=str.toCharArray();
        int temp[]=new int[str.length()];
        int visted=-1;
        for (int i = 0; i <coo.length ; i++) {
            if (temp[i]==visted)continue;;
            int count=1;
            for (int j = i+1; j < coo.length; j++) {
                if (coo[i]==coo[j]){
                    temp[j]=visted;
                    count++;
                }
            }
            if (temp[i]!=visted){
                temp[i]=count;
            }

        }
        System.out.println(Arrays.toString(temp));
        System.out.println("________________");
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        char minChar=' ';
        char maxChar=' ';
        for (int i = 0; i <temp.length ; i++) {
            if (temp[i] >= 1) {
                System.out.println(coo[i]+" "+temp[i]);
                if (temp[i]<min){
                    min=temp[i];
                    minChar=coo[i];
                }
                if (temp[i]>max){
                    max=temp[i];
                    maxChar=coo[i];
                }


            }
        }
        System.out.println("Minimum charater="+ minChar);
        System.out.println("Maximum charater="+ maxChar);

    }
}
