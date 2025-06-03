package String;

public class ReverseString {
    public static void main(String[] args) {
        String str="Raj";
        String rev="";
        char ch[]=str.toCharArray();
        for (int i=str.length()-1;i>=0;i--){
            rev+=ch[i];
        }
        System.out.println(rev);
    }
}
