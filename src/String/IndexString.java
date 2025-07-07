package String;

public class IndexString {
    public static void main(String[] args) {
        //1 way
        String name=new String("Yadnyesh");
        System.out.println(name.indexOf('y'));

        //2 way
        String fullname="Yadnyesh Borse";
        System.out.println(fullname.indexOf("Borse"));

        //3 way
        //This method returns the index of the first occurrence of the specified substring by starting the search at the specified index.
        String s = new String("Welcome to geeksforgeeks");
        System.out.println(s.indexOf("geeks",14));
    }
}
