package String;

public class determine_whether_given_string_palindrome {
    public static void main(String[] args) {
            String name="madam";
            String reverse="";
        for (int i = name.length()-1; i >=0 ; i--) {
            reverse+=name.charAt(i);
        }
        System.out.println(reverse+" reverse no");
        if (reverse.equalsIgnoreCase(name)){
            System.out.println("It is palindrome no");
        }else {
            System.out.println("It is not palindrome no");
        }
    }
}
