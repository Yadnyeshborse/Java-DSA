package Collections.Queue;

import java.util.PriorityQueue;

public class PriotyQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(2);
        pq.add(5);
        pq.add(4);
        System.out.println("List="+pq);

        // Peek at the top element of the queue
        System.out.println("Peak="+pq.peek());


        //remove smallest part
        pq.poll();
        System.out.println("POLL="+pq);

        // Check if the queue contains a specific element
        System.out.println("Does the queue contain 3? " + pq.contains(3));

    }
}
