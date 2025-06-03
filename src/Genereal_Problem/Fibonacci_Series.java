package Genereal_Problem;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int a=0,b=1;
        int n=10;
        System.out.print(a+" "+b);
        for (int i=2;i<n;i++){
            int next=a+b;
            System.out.println(" "+next);
            a=b;
            b=next;
        }
    }
}
