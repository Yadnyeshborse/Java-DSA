package String;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        String str="ASNAAJDOKOPP" ;
        int[] temp=new int[str.length()];
        char[] main=str.toCharArray();
        int visited=-1;
        System.out.println(main);
        for (int i = 0; i <main.length ; i++) {
            if (temp[i]==visited)continue;
            int count=1;
            for (int j = i+1; j <main.length ; j++) {
                if (main[i]==main[j]){
                    temp[j]=visited;
                    count++;
                }
            }
            if (temp[i]!=visited){
                temp[i]=count;
            }

        }
        System.out.println(Arrays.toString(temp));
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]>=1){
                System.out.println(main[i]+" count="+temp[i]);
            }

        }
    }

}
