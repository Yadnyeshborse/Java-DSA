package genereal_Problem;

public class Demo {
    public static void main(String[] args) {

        for (int i = 2; i <20 ; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int i) {
        if (i==1){
            return false;
        }
        for (int j = 2; j <=Math.sqrt(i); j++) {
            if (i%j==0)return false;
        }
        return true;
    }
}
