package Array;

public class ReverseNo {
    public static void main(String[] args) {
        int no=123,p=0;
        while (no>0){
            p=p*10+no%10;
            no/=10;
        }
        System.out.println(p);
    }
}
