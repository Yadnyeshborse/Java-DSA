package String;

import java.util.function.Function;
import java.util.stream.Collectors;

//"Parenthesis Checker:
// Write a program to check if a given string of parentheses is balanced.
// The string can contain different types of parentheses, including '(', ')', '{', '}', '[', ']'.
// Input: exp = “[()]{}{[()()]()}” Output: Balanced
//Input: exp = “[(])” Output: Not Balanced "
public class Demo {
    public static void main(String[] args) {
        String input="[()]{}{[()()]()}";
         boolean result = input
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                 .entrySet()
                 .stream()
                 .allMatch(i->i.getValue()%2==0);

        if (result){
            System.out.println("Balanced");
        }else {
            System.out.println("Not Balanced");
        }

    }
}
