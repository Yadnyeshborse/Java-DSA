package CollectionsQuestions.Quest;

import java.util.*;

public class GroupSTtringbYLength_quest7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "dog", "banana", "cat", "kiwi");
        Map<Integer,List<String>> map=new HashMap<>();

        for (String num:words){
            int length=num.length();
            if (!map.containsKey(length)){
                map.put(length,new ArrayList<>());
            }
            map.get(length).add(num);
        }
        System.out.println(map);

    }
}
