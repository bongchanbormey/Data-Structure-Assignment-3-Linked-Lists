import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
//        // LinkedList Class Test Cases
//        // Example 1: Integer LinkedList
//        System.out.println("=== Integer LinkedList Example ===");
//        LinkedList<Integer> intList = new LinkedList<>();
//
//        // Insert elements at the beginning
//        System.out.println("\nInserting 10 at the beginning.");
//        intList.insertFirst(10);
//        intList.display();  // Expected: 10 -> null
//
//        System.out.println("\nInserting 20 at the beginning.");
//        intList.insertFirst(20);
//        intList.display();  // Expected: 20 -> 10 -> null
//
//        // Insert elements at the end
//        System.out.println("\nInserting 30 at the end.");
//        intList.insertLast(30);
//        intList.display();  // Expected: 20 -> 10 -> 30 -> null
//
//        System.out.println("\nInserting 40 at the end.");
//        intList.insertLast(40);
//        intList.display();  // Expected: 20 -> 10 -> 30 -> 40 -> null
//
//        // Insert element at specific index
//        System.out.println("\nInserting 25 at index 1.");
//        intList.insertAt(25, 1);
//        intList.display();  // Expected: 20 -> 25 -> 10 -> 30 -> 40 -> null
//
//        System.out.println("\nInserting 35 at index 4.");
//        intList.insertAt(35, 4);
//        intList.display();  // Expected: 20 -> 25 -> 10 -> 30 -> 35 -> 40 -> null
//
//        // Find elements
//        System.out.println("\nFinding index of 30:");
//        int index = intList.find(30);
//        System.out.println("Index of 30: " + index); // Expected: 3
//
//        System.out.println("\nFinding index of 100:");
//        index = intList.find(100);
//        System.out.println("Index of 100: " + index); // Expected: -1
//
//        // Delete first element
//        System.out.println("\nDeleting first element.");
//        boolean deleted = intList.deleteFirst();
//        System.out.println("Deleted: " + deleted); // Expected: true
//        intList.display();  // Expected: 25 -> 10 -> 30 -> 35 -> 40 -> null
//
//        // Delete last element
//        System.out.println("\nDeleting last element.");
//        deleted = intList.deleteLast();
//        System.out.println("Deleted: " + deleted); // Expected: true
//        intList.display();  // Expected: 25 -> 10 -> 30 -> 35 -> null
//
//        // Delete element at index
//        System.out.println("\nDeleting element at index 2.");
//        deleted = intList.deleteAt(2);
//        System.out.println("Deleted: " + deleted); // Expected: true
//        intList.display();  // Expected: 25 -> 10 -> 35 -> null
//
//        // Delete element by key
//        System.out.println("\nDeleting element with key 10.");
//        deleted = intList.deleteKey(10);
//        System.out.println("Deleted: " + deleted); // Expected: true
//        intList.display();  // Expected: 25 -> 35 -> null
//
//        System.out.println("\nDeleting element with key 100.");
//        deleted = intList.deleteKey(100);
//        System.out.println("Deleted: " + deleted); // Expected: false
//        intList.display();  // Expected: 25 -> 35 -> null
//
//        // Check if the list is empty
//        System.out.println("\nIs the Integer LinkedList empty? " + intList.isEmpty()); // Expected: false
//
//        // Delete remaining elements
//        System.out.println("\nDeleting first element.");
//        intList.deleteFirst();
//        intList.display();  // Expected: 35 -> null
//
//        System.out.println("\nDeleting first element.");
//        intList.deleteFirst();
//        intList.display();  // Expected: null
//
//        System.out.println("\nIs the Integer LinkedList empty? " + intList.isEmpty()); // Expected: true
//
//
//        // Example 2: String LinkedList
//        System.out.println("\n=== String LinkedList Example ===");
//        LinkedList<String> stringList = new LinkedList<>();
//
//        // Insert elements at the end
//        System.out.println("\nInserting 'Apple' at the end.");
//        stringList.insertLast("Apple");
//        stringList.display();  // Expected: Apple -> null
//
//        System.out.println("\nInserting 'Banana' at the end.");
//        stringList.insertLast("Banana");
//        stringList.display();  // Expected: Apple -> Banana -> null
//
//        // Insert elements at the beginning
//        System.out.println("\nInserting 'Cherry' at the beginning.");
//        stringList.insertFirst("Cherry");
//        stringList.display();  // Expected: Cherry -> Apple -> Banana -> null
//
//        // Insert element at specific index
//        System.out.println("\nInserting 'Date' at index 2.");
//        stringList.insertAt("Date", 2);
//        stringList.display();  // Expected: Cherry -> Apple -> Date -> Banana -> null
//
//        // Find elements
//        System.out.println("\nFinding index of 'Apple':");
//        int index = stringList.find("Apple");
//        System.out.println("Index of 'Apple': " + index); // Expected: 1
//
//        System.out.println("\nFinding index of 'Elderberry':");
//        index = stringList.find("Elderberry");
//        System.out.println("Index of 'Elderberry': " + index); // Expected: -1
//
//        // Delete first element
//        System.out.println("\nDeleting first element.");
//        boolean deleted = stringList.deleteFirst();
//        System.out.println("Deleted: " + deleted); // Expected: true
//        stringList.display();  // Expected: Apple -> Date -> Banana -> null
//
//        // Delete last element
//        System.out.println("\nDeleting last element.");
//        deleted = stringList.deleteLast();
//        System.out.println("Deleted: " + deleted); // Expected: true
//        stringList.display();  // Expected: Apple -> Date -> null
//
//        // Delete element at index
//        System.out.println("\nDeleting element at index 1.");
//        deleted = stringList.deleteAt(1);
//        System.out.println("Deleted: " + deleted); // Expected: true
//        stringList.display();  // Expected: Apple -> null
//
//        // Delete element by key
//        System.out.println("\nDeleting element with key 'Apple'.");
//        deleted = stringList.deleteKey("Apple");
//        System.out.println("Deleted: " + deleted); // Expected: true
//        stringList.display();  // Expected: null
//
//        System.out.println("\nDeleting element with key 'Fig'.");
//        deleted = stringList.deleteKey("Fig");
//        System.out.println("Deleted: " + deleted); // Expected: false
//        stringList.display();  // Expected: null
//
//        // Check if the list is empty
//        System.out.println("\nIs the String LinkedList empty? " + stringList.isEmpty()); // Expected: true



//        // Stack Class Test Cases
//        // Example 1: Stack of Integers
//        System.out.println("=== Integer Stack Example ===");
//        Stack<Integer> intStack = new Stack<>();
//
//        // Push elements onto the stack
//        intStack.push(10);
//        intStack.push(20);
//        intStack.push(30);
//
//        // Display stack
//        intStack.display(); // Output: 30 -> 20 -> 10 -> null
//
//        // Peek the top element
//        System.out.println(intStack.peek()); // Output: Peek: 30
//
//        // Pop an element from the stack
//        intStack.pop(); // Output: Popped: 30
//
//        // Display stack after pop
//        intStack.display(); // Output: 20 -> 10 -> null
//
//        // Example 2: Stack of Strings
//        System.out.println("\n=== String Stack Example ===");
//        Stack<String> stringStack = new Stack<>();
//
//        // Push elements onto the stack
//        stringStack.push("Apple");
//        stringStack.push("Banana");
//        stringStack.push("Cherry");
//
//        // Display stack
//        stringStack.display(); // Output: Cherry -> Banana -> Apple -> null
//
//        // Peek the top element
//        stringStack.peek(); // Output: Peek: Cherry
//
//        // Pop an element from the stack
//        stringStack.pop(); // Output: Popped: Cherry
//
//        // Display stack after pop
//        stringStack.display(); // Output: Banana -> Apple -> null
//
//        // Pop remaining elements
//        stringStack.pop(); // Output: Popped: Banana
//        stringStack.pop(); // Output: Popped: Apple
//
//        // Attempt to pop from an empty stack (will throw exception)
//        try {
//            stringStack.pop();
//        } catch (NoSuchElementException e) {
//            System.out.println("Exception: " + e.getMessage()); // Output: Exception: Stack is empty.
//        }
//
//        // Check if the stack is empty
//        System.out.println("Is the String Stack empty? " + stringStack.isEmpty()); // Output: true




//        // Queue Class Test Cases
//        Queue<Integer> queue = new Queue<>();
//
//        // Insert elements into the queue
//        queue.insert(10);
//        queue.insert(20);
//        queue.insert(30);
//
//        // Display the queue
//        queue.display();   // Output: Current Queue: 10 20 30
//
//        // Peek at the front and rear elements
//        System.out.println("Front element: " + queue.peekFront());   // Output: Front element: 10
//        System.out.println("Rear element: " + queue.peekRear());     // Output: Rear element: 30
//
//        // Remove the front element
//        System.out.println("Removed: " + queue.remove());            // Output: Removed: 10
//
//        // Display the queue again
//        queue.display();   // Output: Current Queue: 20 30
//
//
//        Queue<String> queueOne = new Queue<>();
//
//        // Insert elements into the queue
//        queueOne.insert("Apple");
//        queueOne.insert("Banana");
//        queueOne.insert("Cherry");
//
//        // Display the queue
//        queueOne.display();   // Output: Current Queue: Apple Banana Cherry
//
//        // Remove all elements
//        System.out.println("Removed: " + queueOne.remove());   // Output: Removed: Apple
//        System.out.println("Removed: " + queueOne.remove());   // Output: Removed: Banana
//        System.out.println("Removed: " + queueOne.remove());   // Output: Removed: Cherry
//
//        // Check if the queue is empty
//        System.out.println("Is queue empty? " + queueOne.isEmpty());  // Output: Is queue empty? true
//



        // Doubly-Linked List Test Cases
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        // Insert at the front
        list.insertFirst(10);
        list.insertFirst(5);
        System.out.println(list); // Output: [5, 10]

        // Insert at the back
        list.insertLast(20);
        list.insertLast(30);
        System.out.println(list); // Output: [5, 10, 20, 30]

        // Insert at index
        list.insertAt(15, 2);
        System.out.println(list); // Output: [5, 10, 15, 20, 30]

        // Delete first element
        list.deleteFirst();
        System.out.println(list); // Output: [10, 15, 20, 30]

        // Delete last element
        list.deleteLast();
        System.out.println(list); // Output: [10, 15, 20]

        // Delete at index
        list.deleteAt(1);
        System.out.println(list); // Output: [10, 20]

        // Find index of an element
        int index = list.find(20);
        System.out.println("Index of 20: " + index); // Output: Index of 20: 1

        // Display forward
        list.displayForward(); // Output: 10 20

        // Display backward
        list.displayBackward(); // Output: 20 10

    }
}
