package String;

public class FormatMethod {
    public static void main(String[] args) {
        String name = "Yadnyesh";
        int age = 25;
        System.out.println(String.format("My name is %s and I am %d years old.",name,age));

        String namo = "Java";
        int year = 1995;
        double version = 21.0;

        String formatted = String.format("Language: %s | Since: %d | Latest: %.1f", namo, year, version);
        System.out.println(formatted);

    }
}
