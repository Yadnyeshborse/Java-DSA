package Recurrision.General_question;

public class Sum_Of_indivisual_no {
    public static void main(String[] args) {
        int reult=1234;
        int sum=0;
        while (reult>0){
            int res=reult%10;
            sum+=res;
            reult/=10;
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
}
