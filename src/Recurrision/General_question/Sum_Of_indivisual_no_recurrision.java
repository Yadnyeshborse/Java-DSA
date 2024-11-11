package Recurrision.General_question;

public class Sum_Of_indivisual_no_recurrision {
    public static void main(String[] args) {
        int result=sumof(1234);
        System.out.println(result);
    }

    private static int sumof(int n) {
        if (n==1){
            return 1;
        }
        return (n%10)+sumof(n/10);
    }
}
