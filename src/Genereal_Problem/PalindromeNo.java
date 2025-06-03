package Genereal_Problem;

import java.util.Arrays;

public class PalindromeNo {
    public static void main(String[] args) {
        int no=121,p=0,l=no;
        while (no!=0){
            p=p*10+no%10;
            no/=10;

        }

        if(p==l){
            System.out.println("It is palindrome no");
        }else {
            System.out.println("It is not");
        }
    }
}

