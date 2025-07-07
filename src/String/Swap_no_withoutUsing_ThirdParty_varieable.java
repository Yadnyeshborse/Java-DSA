package String;

public class Swap_no_withoutUsing_ThirdParty_varieable {
    public static void main(String[] args) {
        String str1 = "Good ", str2 = "morning ";
        System.out.println("Before swaping="+str1+" "+str2);
        str1=str1+str2;
        str2=str1.substring(0,(str1.length()-str2.length()));
        str1=str1.substring(str2.length());
        System.out.println(str1+"---->"+str2);
    }
}
