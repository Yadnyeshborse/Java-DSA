package Collections.List;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        //update
        list.set(2,7);
        System.out.println(list);

        //remove
        list.remove(1);
        System.out.println(list);
        //remove by object
        list.remove(Integer.valueOf(4));
        System.out.println(list);

        //get element
        System.out.println(list.get(2));

        System.out.println("LinkedList to array");
        Integer[] a=list.toArray(new Integer[0]);
        for (Object element:a){
            System.out.println(element);
        }

        //size
        System.out.println("SIZE="+list.size());
    }
}
