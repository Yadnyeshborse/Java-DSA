package Stacks.InDetails;


public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if (this.isFull()) {
            // Double the array size
            int[] temp = new int[data.length * 2];

            // Copy all previous items in new data
            for (int i = 0; i < size; i++) {
                temp[i] = data[(start + i) % data.length];
            }
            start = 0;
            end = size; // Reset end to the current size
            data = temp;
        }

        // Insert item (array is not full now)
        return super.insert(item);
    }
}


