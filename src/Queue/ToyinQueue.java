package Queue;

public class ToyinQueue {

    private final int[] queue;
    private int currentQuePosition;

    public ToyinQueue(int givenLength) {
        queue = new int[givenLength];
        currentQuePosition = queue.length - 1;
    }

    public boolean isEmpty() {
        return (currentQuePosition == -1);
    }

    public void enqueue(int element) {

        queue[currentQuePosition--] = element;

    }

    public int peek() {

        return queue[currentQuePosition];
    }

    public int viewFront() {

        return (queue[--currentQuePosition]);
    }

//    public int dequeue() {
//
//    }
}
