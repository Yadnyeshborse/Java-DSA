package Collections.Queue.PriotyQueuePac;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Example1 {
    public static void main(String[] args) {
        // Custom comparator: Sort strings by length (ascending)
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(String::length));

        pq.add("Apple");
        pq.add("Banana");
        pq.add("Grapes");
        pq.add("Kiwi");

        pq.forEach(i->System.out.println(i));
    }
}
