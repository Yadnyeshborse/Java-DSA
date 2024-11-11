package Recurrision.General_question;

public class ReverserDemo {
    public static void main(String[] args) {
        int num=1234;
        int rev=rev(num,0);
        System.out.println(rev);
    }

    private static int rev(int num, int reverse) {
        if (num==0){
            return reverse;
        }
        int remainder=num%10;
        reverse=reverse*10+remainder;


        return rev(num/10,reverse);
    }
}
