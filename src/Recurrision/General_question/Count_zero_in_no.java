package Recurrision.General_question;

public class Count_zero_in_no {
    public static void main(String[] args) {
        int count=0;
        int result=countzero(12009,count);
        System.out.println(result);
    }

    private static int countzero(int num,int count) {

        int val=0;
        val=num%10;
        if (num==0){
            return count;
        }
        if (val==0){
            count+=1;
        }



        return countzero(num/=10,count);
    }


}
