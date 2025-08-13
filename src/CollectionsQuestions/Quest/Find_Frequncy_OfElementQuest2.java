package CollectionsQuestions.Quest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_Frequncy_OfElementQuest2 {
    public static void main(String[] args) {
        //Given a list of strings, count how many times each string appears.
        List<String> list= Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String,Integer> map=new HashMap<>();
        for (String item:list){
            map.put(item,map.getOrDefault(item,0)+1);
        }
        System.out.println(map);
        //getOrDefault(item, 0)
        //getOrDefault(key, defaultValue) is a Java 8 method for maps.
        //It tries to get the value for the given key (item in this case).
        //If the key is present, it returns the existing value.
        //If the key is not present, it returns the given defaultValue.
        //frequencyMap.getOrDefault("apple", 0)  // returns 2 (already present)
        //frequencyMap.getOrDefault("orange", 0) // returns 0 (not yet present)
        //We add 1 to the retrieved value because we just found another occurrence of the item.
        //Why it works
        //First time "apple" appears → getOrDefault("apple", 0) returns 0 → 0 + 1 → store 1 in the map.
        //Second time "apple" appears → getOrDefault("apple", 0) returns 1 → 1 + 1 → store 2.

        Map<String,Long> map1=list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(map1);

    }
}
