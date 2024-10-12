public class DoublyLink<T> {
    T data;
    private DoublyLink<T> next;
    private DoublyLink<T> previous;

    public DoublyLink(T data) {
        this.data = data;
    }

    // Data getter
    public T getData() { return data; }

    // Previous Reference getter
    public DoublyLink<T> getPrevious() { return previous; }

    // Next Reference getter
    public DoublyLink<T> getNext() { return next; }

    // Setter for next
    public void setNext(DoublyLink<T> next) {
        this.next = next;
    }

    // Previous Reference getter
    public void setPrevious(DoublyLink<T> previous) {
        this.previous = previous;
    }
}
