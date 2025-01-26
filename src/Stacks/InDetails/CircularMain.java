package Stacks.InDetails;

public class CircularMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);

        System.out.println("Inserting elements into CircularQueue:");
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        queue.display();

        System.out.println("Removing elements:");
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();

        System.out.println("Testing DynamicQueue:");
        DynamicQueue dynamicQueue = new DynamicQueue(3);

        dynamicQueue.insert(10);
        dynamicQueue.insert(20);
        dynamicQueue.insert(30);

        System.out.println("Before resizing:");
        dynamicQueue.display();

        dynamicQueue.insert(40); // Triggers resizing
        dynamicQueue.insert(50);

        System.out.println("After resizing:");
        dynamicQueue.display();
    }
}
