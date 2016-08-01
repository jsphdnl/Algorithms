package main.java.stack;

/**
 * Created by mamu on 8/2/16.
 */
public class Node <T>{
   private T data;
   private Node<T> next;

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
