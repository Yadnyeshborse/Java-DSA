package String;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "Brag";
        String str2 = "Grab";
        if (str1.length()!=str2.length()){
            System.out.println("String are not anagram");
        }else {
            char[] st1=str1.toLowerCase().toCharArray();
            char[] st2=str2.toLowerCase().toCharArray();
            Arrays.sort(st1);
            Arrays.sort(st2);
            if (Arrays.equals(st1,st2) == true){
                System.out.println("String are anagram");
            }else {
                System.out.println("String are not anagram");
            }
        }

    }
}
