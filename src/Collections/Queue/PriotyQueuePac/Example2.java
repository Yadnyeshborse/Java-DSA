package Collections.Queue.PriotyQueuePac;

import java.util.PriorityQueue;

public class Example2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); // Max-Heap
        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(8);
        maxHeap.forEach(p->System.out.println(p));
    }

}
