package String;

import java.util.Arrays;

public class Find_duplicate_wording_string {
    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";
        String words[]=string.split(" ");
        System.out.println(Arrays.toString(words));
        int[] temp=new int[words.length];
        int visited=-1;
        for (int i = 0; i <words.length ; i++) {
            if (temp[i]==visited)continue;
            int count=1;
            for (int j = i+1; j <words.length ; j++) {
                if (words[i].equals(words[j])){
                    count++;
                    temp[j]=visited;
                }
            }
            if (temp[i]!=visited){
                temp[i]=count;
            }
        }
        System.out.println(Arrays.toString(temp));
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]>1){
                System.out.println(words[i]+" "+temp[i]);
            }

        }
    }
}
