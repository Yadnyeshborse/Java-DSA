package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Example_Map {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("Raj",1);
        map.put("Sau",2);
        map.put("Tau",3);
        map.put("Rau",4);
        System.out.println(map);

        map.forEach((key,value)->System.out.println(key+" = "+value));

        map.put("Sau",8);
        System.out.println(map);

        map.remove("Rau");
        System.out.println("Remove"+map);
    }
}
