package String;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str1="    Remove white spaces   ";
        System.out.println("Remove white spaces from both end="+str1);
        System.out.println(str1.trim());

        //replace all white spaces
        System.out.println(str1.replaceAll("\\s",""));
    }
}
