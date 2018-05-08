package datastruct.list.dll;

public class DLinkedList<T> {
    
    private int size = 0;
    private DNode<T> head = null;
    private DNode<T> tail = null;

    /**
     * insert a new element in the front of list
     * @param data
     */
    public void addFirst(T data) {
        DNode<T> newNode = new DNode<T>(data);
        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else {
            DNode<T> oldHead = head;
            newNode.next = oldHead;
            oldHead.prev = newNode;
            head = newNode;
        }
        size++;
    }

    /**
     * insert a new element at the end of list
     * @param data
     */
    public void addLast(T data) {
        DNode<T> newNode = new DNode<T>(data);
        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else {
            DNode<T> oldTail = tail;
            oldTail.next = newNode;
            newNode.prev = oldTail;
            tail = newNode;
        }
        size++;
    }

    public void insert(T data, int pos) {

    }

    public String list() {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        DNode temp = head;
        while (temp.next != null) {
            sb.append(temp.data).append(":");
            System.out.println("Print node: " + temp.data);
            temp = temp.next;
        }
        sb.append(temp.data);
        System.out.println("Print node: " + temp.data);
        return sb.toString();
    }

    /**
     * get the first element
     * @return
     */
    public T getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    /**
     * get the last element
     * @return
     */
    public T getLast() {
        if (tail == null) {
            return null;
        }
        return tail.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}
