package array;


import java.util.Arrays;

public class Deemo {
    public static void main(String[] args) {

        int a = 15, b = 25, c = 20;
        int result=Math.max(a,Math.max(b,c));
        System.out.println(result);
        if (a>b && a>c){
            System.out.println(a);
        } else if (b>c && b>a) {
            System.out.println(b);
        }else {
            System.out.println(a);
        }

    }


}