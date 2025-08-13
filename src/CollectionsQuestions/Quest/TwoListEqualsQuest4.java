package CollectionsQuestions.Quest;

import java.util.Arrays;
import java.util.List;

public class TwoListEqualsQuest4 {
    public static void main(String[] args) {
        List<String>  List1 = Arrays.asList("apple", "banana", "orange");
        List<String> List2 = Arrays.asList("apple", "banana", "orange");
        List<String> list3 = Arrays.asList("banana", "orange","apple");
        System.out.println(List1.equals(List2));
        System.out.println(List1.equals(list3));


    }
}
