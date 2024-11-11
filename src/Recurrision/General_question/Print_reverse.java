package Recurrision.General_question;

public class Print_reverse {
    public static void main(String[] args) {
        printreverse(5);
    }

    private static void printreverse(int i) {
        if (i==0){
            return;
        }
        printreverse(i-1);
        System.out.println(i);
    }
}
