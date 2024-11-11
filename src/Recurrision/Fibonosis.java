package Recurrision;

public class Fibonosis {
    public static void main(String[] args) {
        int result = fibo(400);  // Capture the result of the Fibonacci function
        System.out.println(result);
    }

    static int fibo(int n) {
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
