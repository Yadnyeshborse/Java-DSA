package Collections.List;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(i->System.out.println(i+" "));
        System.out.println("________________________");

        //adding at specific index
        list.add(1,90);
        list.forEach(System.out::println);
        System.out.println("________________________");

        list.remove(3);
        list.forEach(System.out::println);
        System.out.println("________________________");

        //removing element by using value
        list.remove("1");
        list.forEach(System.out::println);
        System.out.println("________________________");

        //update
        list.set(1,98);
        list.forEach(System.out::println);


    }
}
