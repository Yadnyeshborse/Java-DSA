package Array;

public class CheckNoIsPerfectSqurt {
    public static void main(String[] args) {
        int sqo=20;
        double sq=Math.sqrt(sqo);
        if (sq==Math.floor(sq)){
            System.out.println("It is perfect square");
        }else {
            System.out.println("It is not ");
        }
    }
}
