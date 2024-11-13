package Recurrision.General_question;

public class Demo {
    public static void main(String[] args) {
        int no=1234;
        int result=reva(no,0);
        System.out.println(result);
    }

    private static int reva(int no, int reverse) {
        if(no==0){
            return reverse;
        }
        int remainder=no%10;
        reverse=reverse*10+remainder;
        return reva(no/10,reverse);
    }
}
