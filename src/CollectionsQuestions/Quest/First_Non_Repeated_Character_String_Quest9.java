package CollectionsQuestions.Quest;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Non_Repeated_Character_String_Quest9 {
    public static void main(String[] args) {
        String str = "swiss";
        Map<Character,Integer> map=new LinkedHashMap<>();

        for (char st:str.toCharArray()){
            map.put(st,map.getOrDefault(st,0)+1);
        }
        System.out.println(map);
        Character so=null;
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()==1){
                so=entry.getKey();
                break;
            }
        }
        System.out.println(so);

    }
}
