package String;

public class SplitMethods {
    public static void main(String[] args) {
        String s = "a/b/c/d";
        System.out.println("split string using regex with limit:");
        String[] a2 = s.split("/", 2);
        for (String string : a2) {
            System.out.println(string);
        }
        System.out.println("***********************");
        String[] a3 = s.split("/", 3);
        for (String string : a3) {
            System.out.println(string);
        }
      //  s.split("/", 2);
//        "/" → the regex (delimiter).
//        → the limit (maximum number of substrings to return).
//
//        The limit tells Java how many pieces to split into:
//        If limit > 0: split at most limit - 1 times
//        If limit = 0: split as many as possible, but remove trailing empty strings.
//        If limit < 0: split as many as possible, keeping trailing empty strings.
    }
}
