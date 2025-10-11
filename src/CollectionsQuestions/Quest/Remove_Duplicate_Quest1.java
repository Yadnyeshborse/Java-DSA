package CollectionsQuestions.Quest;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Remove_Duplicate_Quest1 {
    public static void main(String[] args) {
        //Given a List<Integer>, remove all duplicates while maintaining the insertion order.
        List<Integer> list= Arrays.asList(4, 2, 4, 5, 2, 3, 1);
//        LinkedHashSet<Integer> integers=new LinkedHashSet<>(list);
//        System.out.println(integers);

        //second way
        LinkedHashSet<Integer> integers=new LinkedHashSet<>();
        integers.addAll(list);
        System.out.println(integers);

    }
}
