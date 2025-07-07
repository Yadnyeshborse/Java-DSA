package String;

import java.util.Arrays;

public class Most_Repeated_words {
    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";
        String[] words=string.split(" ");
        int temp[]=new int[words.length];
        int vistited=-1;
        for (int i = 0; i <words.length ; i++) {
            if (temp[i]==vistited)continue;;
            int count=1;
            for (int j = i+1; j < words.length; j++) {
                if (words[i].equals(words[j])){
                    count++;
                    temp[j]=vistited;
                }
            }
            if (temp[i]!=vistited){
                temp[i]=count;
            }

        }
        System.out.println(Arrays.toString(temp));
        int max=temp[0];
        String wor=" ";
        for (int i = 1; i <temp.length ; i++) {
            if (temp[i]>max){
                max=temp[i];
                wor=words[i];
            }
        }
        System.out.println(wor+" "+max);
    }
}
