package Collections.Set.LinkedHashSetExample;

import java.util.LinkedHashSet;

public class Example1 {
    public static void main(String[] args) {
        // Creating an empty LinkedHashSet
        LinkedHashSet<String> lh = new LinkedHashSet<String>();

        // Adding elements to above Set
        // using add() method
        lh.add("Geek");
        lh.add("For");
        lh.add("ks");
        System.out.println("LinkedHashSet : " + lh);
        lh.remove("ks");

        System.out.println("LinkedHashSet : " + lh);
    }
}
