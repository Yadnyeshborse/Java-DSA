package Collections.Set.HashSetExample;

import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.forEach(i->System.out.println(i));
    }
}
