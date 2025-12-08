package array.practise;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demoo {
    public static void main(String[] args) {
        int[] elements = {2, 3, 1, 4, 4, 1, 4, 4, 3, 333, 2, 4, 2, 5, 222, 4, 1, 6, 4};

        Optional<Integer> result = Arrays.stream(elements).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);

        System.out.println(result);

//        =================
//
//        Integer i1 =10;
//
//        Integer i2 =10;
//
//        sop(i1==i2);
//
//        sop(i1.equals(i2));
//
//        sop("10".equals(i1));
//
//        sop(i1.equals("10"));
//
//        Integer i1 =10;
//
//        Integer i2 =10;
//
//        sop(i1==i2); = true
//
//        sop(i1.equals(i2)); = true
//
//        sop("10".equals(i1)); = false
//
//        sop(i1.equals("10")); =false
//
//                =======
//
//        class Person{}
//
//        Person p1 = new Person();
//
//        Person p2 = new Person();
//
//        sop(p1.equals(p2));
//
//        sop(p1==p2);
//
//
//        class Person{}
//
//        Person p1 = new Person();
//
//        Person p2 = new Person();
//
//        sop(p1.equals(p2)); = false
//
//        sop(p1==p2); = false
//
//        sop(p1==p2); = true ?
//
//                p1=p2;
//
//==================================
//
//
//
//        private static void mostRepeatedElement() {
//
//            int [] elements = {2,3,1,4,4,1,4,4,3,333,2,4,2,5,222,4,1,6,4};
//
//            //........

    }

}




