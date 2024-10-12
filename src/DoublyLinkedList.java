public class DoublyLinkedList<T> {
    private DoublyLink<T> head;
    private DoublyLink<T> tail;
    private int size;

    // Constructor
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    // Insert a new node at the beginning of the list
    // Time complexity: O(1)
    public void insertFirst(T newItem) {
        DoublyLink<T> newLink = new DoublyLink<>(newItem);
        if (isEmpty()) {
            head = tail = newLink;      // If empty, both head and tail point to the new node
        } else {
            newLink.setNext(head);      // Point the new link (->) to the current link
            head.setPrevious(newLink);  // Point the new link (<-) to the current link
            head = newLink;             // Update the head to the new link
        }
        size++;
    }


    // Insert a new node at the end of the list
    // Time complexity: O(1)
    public void insertLast(T newItem) {
        DoublyLink<T> newLink = new DoublyLink<>(newItem);
        if (isEmpty()) {
            head = tail = newLink;      // If empty, both head and tail point to the new node
        } else {
            tail.setNext(newLink);      // Point the current tail (->) to the new link
            newLink.setPrevious(tail);  // Point the new link (<-) to the current link
            tail = newLink;             // Update the tail to the new link
        }
        size++;
    }


    // Insert a new node at a specific index
    // Time complexity: O(n) - Needs to traverse the list to find the position
    public void insertAt(T newItem, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bound.");
        }

        if (index == 0) {
            insertFirst(newItem);
        } else if (index == size) {
            insertLast(newItem);
        } else {
            DoublyLink<T> newLink = new DoublyLink<>(newItem);
            DoublyLink<T> current = head;

            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            newLink.setNext(current);                       // Point the new link (->) to the current link
            newLink.setPrevious(current.getPrevious());     // Point the current link (<-) to the new link
            current.getPrevious().setNext(newLink);         // Link the previous node to the new one
            current.setPrevious(newLink);                   // Link the new node back to the current
        }
        size++;
    }


    // Delete the first node in the list
    // Time complexity: O(1)
    public Boolean deleteFirst() {
        if (isEmpty()) {
            return false;
        }

        if (head == tail) {
            head = tail = null;         // If there's only one elem.
        } else {
            head = head.getNext();      // Point the first link (->) to the next link
            head.setPrevious(null);     // Clear the first link
        }
        size--;
        return true;
    }


    // Delete the last node in the list
    // Time complexity: O(1)
    public Boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        if (head == tail) {
            head = tail = null;             // If there's only one elem.
        } else {
            tail = tail.getPrevious();      // Point the last link (<-) to the second-to-last link
            tail.setNext(null);             // Clear the last link
        }
        size--;
        return true;
    }


    // Delete a node at a specific index from the list
    // Time complexity: O(n) - Needs to traverse the list to find the index
    public Boolean deleteAt(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bound.");
        }

        if (index == 0) {
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();
        } else {
            DoublyLink<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            current.getPrevious().setNext(current.getNext());
            current.getNext().setPrevious(current.getPrevious());
            size--;
            return true;
        }
    }


    // Delete a node by its key
    // Time complexity: O(n) - Needs to traverse the list to find the key
    public Boolean deleteKey(T key) {
        int index = find(key);
        if (index != -1) {
            return deleteAt(index);
        }
        return false;
    }


    // Find a node by a key and return its index
    // Time complexity: O(n) - Needs to traverse the list to find the key
    public int find(T key) {
        DoublyLink<T> current = head;
        int index = 0;

        while (current != null) {
            if (current.getData().equals(key)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;      // If not found
    }


    // Check if it's empty
    public Boolean isEmpty() {
        return head == null;
    }


    // String representation of the list
    // Time complexity: O(n)
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        DoublyLink<T> current = head;

        while (current != null) {
            result.append(current.getData());
            if (current.getNext() != null) {
                result.append(", ");
            }
            current = current.getNext();
        }

        result.append("]");
        return result.toString();
    }


    // Display the list from head to tail
    // Time complexity: O(n)
    public void displayForward() {
        DoublyLink<T> current = head;
        System.out.println("Doubly-Linked List (display ->): ");
        while (current != null) {
            System.out.println(current.getData() + " ");        // Current node
            current = current.getNext();                        // Move on to the next node
        }
        System.out.println();
    }


    // Display the list from tail to head
    // Time complexity: O(n)
    public void displayBackward() {
        DoublyLink<T> current = tail;
        System.out.println("Doubly-Linked List (display <-): ");
        while (current != null) {
            System.out.println(current.getData() + " ");        // Current node
            current = current.getPrevious();                    // Move back to the previous node
        }
        System.out.println();
    }
}
