package CollectionsQuestions.Quest;

import java.util.*;
import java.util.stream.Collectors;

public class Sort_Map_by_Values_8 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("apple", 3);
        map.put("banana", 1);
        map.put("orange", 2);
System.out.println(map);

        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
//        System.out.println(list);

        Collections.sort(list,(e1,e2)->e1.getValue().compareTo(e2.getValue()));
        Map<String,Integer> map1=new LinkedHashMap<>();
        for (Map.Entry<String,Integer> MO:list){
            map1.put(MO.getKey(),MO.getValue());

        }
        System.out.println(map1);

        //java 8
        Map<String,Integer> map2=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println(map2);



    }
}
