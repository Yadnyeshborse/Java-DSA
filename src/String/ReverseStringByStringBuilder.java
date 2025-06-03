package String;

public class ReverseStringByStringBuilder {
    public static void main(String[] args) {
        String name="Raj";
        StringBuilder builder=new StringBuilder(name);
        builder.reverse();
        System.out.println(builder);
    }
}
