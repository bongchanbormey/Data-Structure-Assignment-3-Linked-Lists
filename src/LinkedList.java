public class LinkedList<T> {
    private Link<T> head;   // Reference to the first link (head)
    private Link<T> tail;   // Reference to the last link (tail)


    // Constructor
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }


    // Insert a new node at the beginning of the list
    // Time Complexity: O(1)
    public void insertFirst(T newItem) {
        Link<T> newLink = new Link<>(newItem);
        if (isEmpty()) {
            tail = newLink;          // If empty, tail also points to the new link
        }
        newLink.setNext(head);       // Point the new link to the current head
        head = newLink;              // Update the head to the new link
    }


    // Insert a new node at the end of the list
    // Time Complexity: O(1) (since we are using the tail reference)
    public void insertLast(T newItem) {
        Link<T> newLink = new Link<>(newItem);
        if (isEmpty()) {
            head = newLink;
        } else {
            newLink.setNext(null);    // Set the new ref to null
            tail.setNext(newLink);    // Update the previous ref to the new link
        }
        tail = newLink;               // Update the tail to the new link
    }


    // Insert a new node at a specific index
    // Time Complexity: O(n) (since we may need to traverse the list)
    public void insertAt(T newItem, int index) {
        if (index < 0) throw new IndexOutOfBoundsException("Invalid index");
        if (index == 0) {
            insertFirst(newItem);
            return;
        }
        Link<T> current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.getNext();
        }
        if (current == null) throw new IndexOutOfBoundsException("Index out of bounds");
        Link<T> newLink = new Link<>(newItem);
        newLink.setNext(current.getNext());
        current.setNext(newLink);
        if (newLink.getNext() == null) {
            tail = newLink;                 // Update tail if inserted at the end
        }
    }


    // Delete the first node from the list
    // Time Complexity: O(1)
    public boolean deleteFirst() {
        if (isEmpty()) return false;
        head = head.getNext();
        if (head == null) {
            tail = null;                    // If the list is now empty, reset tail
        }
        return true;
    }


    // Delete the last node from the list
    // Time Complexity: O(n) (since we need to traverse the list to find the second-to-last node)
    public boolean deleteLast() {
        if (isEmpty()) return false;
        if (head == tail) {                 // If there's only one element
            head = tail = null;
            return true;
        }
        Link<T> current = head;
        while (current.getNext() != tail) {
            current = current.getNext();
        }
        current.setNext(null);
        tail = current;
        return true;
    }


    // Delete a node at a specific index
    // Time Complexity: O(n)
    public boolean deleteAt(int index) {
        if (isEmpty() || index < 0) return false;
        if (index == 0) return deleteFirst();
        Link<T> current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.getNext();
        }
        if (current == null || current.getNext() == null) return false;
        current.setNext(current.getNext().getNext());
        if (current.getNext() == null) {
            tail = current;                 // Update tail if deleted the last element
        }
        return true;
    }


    // Delete a node by key
    // Time Complexity: O(n)
    public boolean deleteKey(T key) {
        if (isEmpty()) return false;
        if (head.getData().equals(key)) {
            return deleteFirst();
        }
        Link<T> current = head;
        while (current.getNext() != null && !current.getNext().getData().equals(key)) {
            current = current.getNext();
        }
        if (current.getNext() == null) return false;     // Key not found
        current.setNext(current.getNext().getNext());

        if (current.getNext() == null) {
            tail = current;                             // Update tail if deleted the last element
        }
        return true;
    }


    // Find the index of an item by key
    // Time Complexity: O(n)
    public int find(T key) {
        Link<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.getData().equals(key)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;      // Not found
    }


    // Check if the list is empty
    // Time Complexity: O(1)
    public boolean isEmpty() {
        return head == null;
    }


    // View the head node data
    // Time Complexity: O(1)
    public T peekFirst() {
        if (head == null) {
            return null;
        }
        return head.getData();
    }

    // Peek the last node data without removing it
    // Time complexity: O(n) - Needs to traverse to the last node
    public T peekLast() {
        if (head == null) {
            return null;
        }
        Link<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getData();
    }


    // Convert the list to a string
    // Time Complexity: O(n)
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Link<T> current = head;
        while (current != null) {
            sb.append(current.getData()).append(" -> ");
            current = current.getNext();
        }
        sb.append("null");
        return sb.toString();
    }


    // Display the list (alternative to toString)
    // Time Complexity: O(n)
    public void display() {
        System.out.println(this.toString());
    }
}
