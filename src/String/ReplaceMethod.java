package String;

public class ReplaceMethod {
    public static void main(String[] args) {
        String originalString = "Hello World";
        System.out.println(originalString.replace("H","L"));

        String s6 = "GeeksforGeeks";
        System.out.println(s6.replace("Geeks","OP"));


        //Replace Spaces with Underscores Using the replace() Java method
        String sentence = "Geeks for Geeks";
        System.out.println(sentence.replace(" ","-"));

        //replace(char oldChar,  char newChar)
        String s = "Hello World";
        s = s.replace('l', 'm');
        System.out.println("After Replacing l with m :");
        System.out.println(s);

        //replaceAll(String regex, String replacement)
        String s1 = "Hello journaldev, Hello pankaj";
        s1 = s1.replaceAll("Hello", "Hi");
        System.out.println("After Replacing :");
        System.out.println(s1);

        //replaceFirst(String regex, String replacement)
        String s2 = "Hello guys, Hello world";
        s2 = s2.replaceFirst("Hello", "Hi");
        System.out.println("After Replacing :");
        System.out.println(s2);

    }
}
