package Array;

public class LargestOofThree {
    public static void main(String[] args) {
        int a = 15, b = 25, c = 20;
        if (a>=b && a>=c){
            System.out.println("a");
        } else if (b>=a&&b>=c) {
            System.out.println("B");
        }else {
            System.out.println("c");
        }
        int largest=Math.max(a,Math.max(b,c));
        System.out.println("Largest="+largest);
    }
}
