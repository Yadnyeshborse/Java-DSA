package String;

import java.util.Arrays;
import java.util.List;

public class JoinMethod  {
    public static void main(String[] args) {
        String result = String.join("-", "Java", "Python", "C++", "Go");
        System.out.println(result);

        //2
        List<String> languages = Arrays.asList("HTML", "CSS", "JavaScript");
        String resulto = String.join(" | ", languages);
        System.out.println(resulto);
    }
}
