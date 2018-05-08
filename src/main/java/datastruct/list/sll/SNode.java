package datastruct.list.sll;

public class SNode<T> {

    public T data;
    public SNode<T> next;

    public SNode(T data) {
        this.data = data;
        this.next = null;
    }
}
