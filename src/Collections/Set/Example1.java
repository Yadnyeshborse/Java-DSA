package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        Set<Integer> a=new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8}));
        System.out.println(a);

        Set<Integer> b=new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{9,10,11,12,4,5,6,7}));

        Set<Integer> set=new HashSet<>(a);
        set.addAll(b);
        //union
        System.out.println("Union="+set);

        //insertion common elements
        Set<Integer> c=new HashSet<>(a);
        c.retainAll(b);
        System.out.println("Insertion="+c);

        //to finds symmetric difference
        Set<Integer>  d=new HashSet<>(a);
        d.removeAll(b);
        System.out.println("Difference of the two Set="+d);

    }
}
