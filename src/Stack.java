import java.util.NoSuchElementException;

public class Stack<T> {
    private LinkedList<T> stackList;

    // Constructor for stack
    public Stack() {
        stackList = new LinkedList<T>();
    }


    // Push method to add a new elem on top of the stack
    // Time complexity: O(1)
    public void push(T newItem) {
        stackList.insertFirst(newItem);
    }


    // Pop method to remove the top elem from the stack
    // Time complexity: O(1)
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        T item = stackList.peekFirst();
        stackList.deleteFirst();
        return item;
    }


    // Peek method to view the top elem of the stack
    // Time complexity: O(1)
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        return stackList.peekFirst();
    }


    // Check if it's empty
    public boolean isEmpty() {
        return stackList.isEmpty();
    }


    public void display() {
        System.out.println("Current Stack:");
        stackList.display();
    }


    @Override
    public String toString() {
        return stackList.toString();
    }
}
