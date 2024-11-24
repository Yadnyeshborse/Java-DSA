package Recurrision.General_question;

public class Demo {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if (n==10){
            return;
        }
        System.out.println(n);
        print(n+1);

    }


}
