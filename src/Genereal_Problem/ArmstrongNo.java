package Genereal_Problem;

public class ArmstrongNo {
    public static void main(String[] args) {
        int no=153,result=0,digit=0;
        int po=no;
        for (int i = 0; i <3; i++) {
            result=no%10;
            digit=digit+result*result*result;
            no/=10;
        }
        System.out.println(digit);
        if (digit==po){
            System.out.println("It is armstrong no");
        }else {
            System.out.println("It is not");
        }
    }
}
