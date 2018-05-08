package datastruct.stack;

/**
 * Stack implement (FILO)
 * @param <T>
 */
public class Stack<T> {

    /**
     * size of stack
     */
    private int size = 0;
    /**
     * pointer to top node
     */
    private Node<T> top = null;

    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (top != null) {
            T data = top.data;
            top = top.next;
            size--;
            return data;
        }
        return null;
    }

    public T peek() {
        if (top != null) {
            return top.data;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (top == null);
    }
}
