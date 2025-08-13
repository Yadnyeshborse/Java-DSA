package String;

import java.util.Arrays;

public class Find_Largest_smallest_words {
    public static void main(String[] args) {
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";
        String words[]=string.split(" ");
        System.out.println(Arrays.toString(words));
        String min=words[0];
        String  max=words[0];
        for (int i = 1; i <words.length ; i++) {
             if (words[i].length()<min.length()){
                 min=words[i];
            }
             if (words[i].length()>max.length()){
                 max=words[i];
             }


        }
        System.out.println(min);
        System.out.println(max);
    }

}

