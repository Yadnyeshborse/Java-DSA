package Collections.Queue.PriotyQueuePac;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LambdaExample {
    public static void main(String[] args) {
        // Define PriorityQueue with custom sorting:
        // 1. Higher salary first (reversed)
        // 2. If salaries are equal, sort by name (A-Z)
        PriorityQueue<Employee> pq = new PriorityQueue<>(
                Comparator
                        .comparingInt((Employee e) -> e.salary).reversed()
                        .thenComparing(e -> e.name)
        );

        // Add employees
        pq.add(new Employee("Alice", 80000));
        pq.add(new Employee("Bob", 95000));
        pq.add(new Employee("Charlie", 80000)); // Same salary as Alice
        pq.add(new Employee("David", 70000));

        // Poll and print in priority order
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
