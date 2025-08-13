package CollectionsQuestions.Quest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedList_quest_6 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1, 2, 3, 4);
        List<Integer> list1=Arrays.asList(3, 4, 5, 6);

        List<Integer>  list3=new ArrayList<>(list);
//        list3.addAll(list);

        for (Integer no:list1){
            if (!list3.contains(no)){
                list3.add(no);
            }
        }
        System.out.println(list3);

    }
}
