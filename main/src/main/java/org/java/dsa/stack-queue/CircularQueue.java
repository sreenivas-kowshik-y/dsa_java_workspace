// Custom Circular Queue Implementation with O(1) Insert and Remove
public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full!");
        }
        data[end++] = item;
        end %= data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }
        int removed = data[front++];
        front %= data.length;
        size--;
        return removed;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
