package String;

public class ReverserOfString {
    public static void main(String[] args) {
        String string = "Dream big";
        String reverse="";
        for (int i =string.length()-1; i >=0 ; i--) {
            reverse+=string.charAt(i);
        }
        System.out.println(reverse);
    }
}
