package String;

public class LastIndexOF {
    public static void main(String[] args) {
        String s = new String("Hello World");
        System.out.println("Print the last index of the character= " + s.lastIndexOf('o'));

        //To show how to find the last index of a character, searching backwards from a specified index.
        String ss = new String("Welcome to geeksforgeeks");
        System.out.println(ss.lastIndexOf("g",18));


        // Java Program to demonstrate the working of lastIndexOf(String str)
        String sss = new String("Welcome to geeksforgeeks");
        System.out.print("Found substring geeks at: ");
        System.out.println(sss.lastIndexOf("geeks"));

        //To show how to find the last index of a substring, searching backwards from a specified index.
        String ssss = new String("Welcome to geeksforgeeks");
        System.out.print("Found substring geeks at: ");
        System.out.println(ssss.lastIndexOf("geeks", 15));



    }
}
