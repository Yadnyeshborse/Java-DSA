package Recurrision.General_question;

public class Print_no {
    public static void main(String[] args) {
        fun(5);
    }

    private static void fun(int i) {
        if (i==0){
            return;
        }
        System.out.println(i);
        fun(i-1);
    }
}
