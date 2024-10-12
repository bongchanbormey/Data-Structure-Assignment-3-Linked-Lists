import java.util.NoSuchElementException;

public class Queue<T> {
    private LinkedList<T> queueList;   // Linked List for queue


    // Constructor
    public Queue() {
        this.queueList = new LinkedList<T>();
    }


    // Insert Method to add new element at the back of the queue
    // Time complexity: O(1)
    public void insert(T newItem) {
        queueList.insertLast(newItem);
    }


    // Remove Method to remove the element in front of the queue
    // Time complexity: O(1)
    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Nothing to remove.");
        }
        T item = queueList.peekFirst();
        queueList.deleteFirst();
        return item;
    }


    // PeekFront Method to view the front element
    // Time complexity: O(1)
    public T peekFront(){
        if (queueList.isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Nothing's at the front.");
        }
        return queueList.peekFirst();
    }


    // PeekRear Method to view the rear element
    // Time complexity: O(1)
    public T peekRear(){
        if (queueList.isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Nothing's at the rear.");
        }
        return queueList.peekLast();
    }


    // Check if it's empty
    public boolean isEmpty() {
        return queueList.isEmpty();
    }


    public void display() {
        System.out.println("Current Queue:");
        queueList.display();
    }


    @Override
    public String toString() {
        return queueList.toString();
    }

}