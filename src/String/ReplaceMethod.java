package String;

public class ReplaceMethod {
    public static void main(String[] args) {
        String originalString = "Hello World";
        System.out.println(originalString.replace("H","L"));

        String s1 = "GeeksforGeeks";
        System.out.println(s1.replace("Geeks","OP"));


        //Replace Spaces with Underscores Using the replace() Java method
        String sentence = "Geeks for Geeks";
        System.out.println(sentence.replace(" ","-"));
    }
}
