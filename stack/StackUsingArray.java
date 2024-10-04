
// implementing stack with array
public class StackUsingArray {

    private int top;
    private int[] arr;

    public StackUsingArray(int capacity) {
        top = -1;
        arr = new int[capacity];
    }

    public int size() {
        return top + 1;

    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return arr.length == size();
    }

    public void push(int data) {
        if (isFull()) {
            throw new RuntimeException("stack is full");
        }
        top++;
        arr[top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        int result = arr[top];
        top--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        return arr[top];
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(3);
        stack.push(1);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();

    }

}
