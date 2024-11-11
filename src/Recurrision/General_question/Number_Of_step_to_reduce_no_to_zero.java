package Recurrision.General_question;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class Number_Of_step_to_reduce_no_to_zero {
    public static void main(String[] args) {
        int number=14;
        int step=0;
        int result=findStep(number,step);
        System.out.println(result);
    }

    private static int findStep(int number,int step) {

        if (number==0){
            return step;
        }
        if(number%2==0){
            return findStep(number/2,step+1);
        }else {
            return findStep(number-1,step+1);
        }
    }
}
