package Genereal_Problem;

public class PrimeNo {
    public static void main(String[] args) {

        int limit=50;
        for (int i = 2; i <limit ; i++) {
            if (isPrimeNoo(i)) {
                System.out.println(i+" ");
            }
        }
    }

    private static boolean isPrimeNoo(int num) {
        if (num<=1)return false;
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
