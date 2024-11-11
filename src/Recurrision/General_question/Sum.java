package Recurrision.General_question;

public class Sum {
    public static void main(String[] args) {
        int result=sumo(5);
        System.out.println(result);
    }

    private static int sumo(int n) {
        if (n==1){
            return 1;
        }
        return n+sumo(n-1);
    }
}
