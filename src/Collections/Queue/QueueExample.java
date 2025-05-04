package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        System.out.println(queue);

        String front=queue.remove();
        System.out.println("Remove from front="+front);

        String peeked=queue.peek();
        System.out.println("Return without removing="+queue);

        //queue is strickly FIFO
    }
}
