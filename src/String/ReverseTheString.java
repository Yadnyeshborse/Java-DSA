package String;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class ReverseTheString {
    public static void main(String[] args) {
        String input = "Java is awesome";
        String words[]=input.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = words.length-1; i >=0 ; i--) {
            System.out.print(words[i]+" ");

        }
    }

}
