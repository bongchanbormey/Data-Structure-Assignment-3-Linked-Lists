public class Link<T>{
    private T data;          // The actual data
    private Link<T> next;    // Reference to the next link in the list

    //Constructor
    public Link(T data){
        this.data = data;
        this.next = null;   // Initially, no next link (null)
    }


    // Data getter
    public T getData() { return data; }

    // Reference getter
    public Link<T> getNext() { return next; }

    // Setter for next
    public void setNext(Link<T> next) {
        this.next = next;
    }
}