package queue;

import doublylinkedlist.DoublyLinkedList;

/**
 * Created by mamu on 8/4/16.
 */
public class QueueImp<T> implements Queue<T> {

  private DoublyLinkedList<T> queue;
  private int size;

  public QueueImp() {
    queue = new DoublyLinkedList<>();
    size = 0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public T dequeue() {
    T data = null;
    if (size != 0){
      data = queue.removeAtHead();
      size --;
    }
    return data;
  }

  @Override
  public void enqueue(T data) {
    queue.addAtHead(data);
    size++;
  }

  @Override
  public boolean isEmpty() {
    return size == 0 ? true : false;
  }
}
