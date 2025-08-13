package String;



public class Demo {
    public static void main(String[] args) {
        int no=123;
        int res=0,po=no;
        while (no!=0){
            res=no%10+res*10;
            no/=10;
        }
        if (res==po){
            System.out.println("It is palindome");
        }else {
            System.out.println("It is not");
        }
        
    }

}
