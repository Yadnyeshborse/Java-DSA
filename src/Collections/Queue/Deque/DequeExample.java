package Collections.Queue.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque=new LinkedList<String>();
        deque.add("Elemenet 7");
        deque.addFirst("Element 6");
        deque.addLast("Element 8");
        deque.addFirst("Element 5");
        deque.addLast("Element 9");
        deque.addFirst("Element 4");
        deque.addLast("Element 10");

        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);


    }
}
