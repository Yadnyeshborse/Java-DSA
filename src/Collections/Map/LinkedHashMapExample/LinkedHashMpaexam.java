package Collections.Map.LinkedHashMapExample;

import java.util.LinkedHashMap;

public class LinkedHashMpaexam {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>  map=new LinkedHashMap<>();
        map.put(1,"Raj");
        map.put(2,"Aaru");
        map.put(3,"Zaebra");
        map.put(4,"Sam");
        System.out.println(map);

        map.forEach((key,value)->System.out.println(key+" -> "+value));

        map.put(4,"Lpo");
        System.out.println("Updated"+map);
    }
}
