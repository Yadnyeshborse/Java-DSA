package Recurrision.General_question;

public class Prod_of_no {
    public static void main(String[] args) {
        int result=prod(1234);
        System.out.println(result);
    }

    private static int prod(int n) {
        if (n%10==n){
            return n;
        }
        return (n%10)*prod(n/10);
    }
}
