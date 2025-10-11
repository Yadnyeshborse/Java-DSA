package CollectionsQuestions.Quest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList_quest5 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple", "banana", "orange");
        Collections.reverse(list);
        System.out.println(list);
    }
}
