package String;

public class DivideStringInEqualsParts {
    public static void main(String[] args) {
        String str = "aaaabbbbcccc";
         int divide=4;
         if (str.length()%divide!=0){
             System.out.println("Can be divide in equal parts");
         }
         int sub=str.length()/divide;
        for (int i = 0; i <str.length() ; i+=sub) {
            System.out.println(str.substring(i,i+sub));
        }
    }
}
