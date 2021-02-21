package Stack;

public class ToyinStack {

    private final int[] elements;
    private int currentPosition = -1;



    public ToyinStack(int stackSize) {
        elements = new int[stackSize];
    }

    public boolean is_Empty() {
        return (currentPosition == -1);
    }

    public void push(int element) {

        if (isFull()){
            throw new StackOverflowException("Sorry...the stack is already full");
        }
        this.elements[++currentPosition] = element;
    }

    public int peek() {
        if (is_Empty()){
            throw new StackUnderflowException("The stack is currently empty");
        }
        return elements[currentPosition];
    }

    public int pop() {
        if (is_Empty()){
            throw new StackUnderflowException("The stack is currently empty");
        }
        int lastPosition = elements[currentPosition];
        elements[currentPosition--] = 0;
        return lastPosition;
    }

    public boolean isFull() {
        return (currentPosition == elements.length - 1);
    }

    public static class StackOverflowException extends RuntimeException{
        public StackOverflowException(String message){
            super(message);
        }
    }

    public static class StackUnderflowException extends RuntimeException{
        public StackUnderflowException(String message){
            super(message);
        }
    }
}
