package String;

public class replace_the_spaces_of_string_with_a_specific_character {
    public static void main(String[] args) {
        String string = "Once in a blue moon";
        String so=string.toLowerCase();
        char ch = '-';
        System.out.println(so.replaceAll("o","-"));

    }
}
