package String;

public class InternMethod {
    public static void main(String[] args) {
        String s1 = "pankaj";
        String s2 = "pankaj";
        String s3 = new String("pankaj");

        System.out.println(s1==s2);//true
        System.out.println(s2==s3);//false

        String s4 = s3.intern();
        System.out.println(s1==s4);//true
    }
}
