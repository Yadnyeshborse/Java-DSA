package Stacks.InDetails;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int start = 0;
    protected int size = 0; // Change access modifier from private to protected


    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0; // Corrected logic
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end] = item;
        end = (end + 1) % data.length; // Circular increment
        size++;
        return true;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[start]; // Corrected `front` to `start`
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[start]; // Corrected `front` to `start`
        start = (start + 1) % data.length; // Circular increment
        size--;
        return removed;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = start;
        int count = size; // Only display up to the number of elements
        while (count > 0) {
            System.out.print(data[i] + " -> ");
            i = (i + 1) % data.length; // Circular increment
            count--;
        }
        System.out.println("END");
    }
}
