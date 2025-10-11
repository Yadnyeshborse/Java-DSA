package string;

public class SubStringPattern {
    public static void main(String[] args) {
        String str = "123456789";
        String firstPart=str.substring(0,5);
        String lastPart=str.substring(str.length()-2);
        System.out.println(firstPart+"**"+lastPart);
    }
}
