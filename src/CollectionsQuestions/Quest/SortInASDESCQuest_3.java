package CollectionsQuestions.Quest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortInASDESCQuest_3 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5, 2, 9, 1, 3);
//        Collections.reverse(list);
//        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
