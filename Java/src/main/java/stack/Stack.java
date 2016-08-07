package stack;

import doublylinkedlist.DoublyLinkedList;

/**
 * Created by mamu on 8/3/16.
 */
public interface Stack<T> {
  //push
  public boolean push(T data);
  //pop
  public T pop();
  //isEmpty
  public boolean isEmpty();
  //size
  public Integer size();
}
