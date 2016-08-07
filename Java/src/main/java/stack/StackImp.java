package stack;

import doublylinkedlist.DoublyLinkedList;

import java.util.List;

/**
 * Created by mamu on 8/2/16.
 */
public class StackImp<T> implements Stack<T>{
  //List
  private DoublyLinkedList<T> stack;
  private int size;
  //size

  public StackImp() {
    stack = new DoublyLinkedList<>();
    size = 0;
  }

  @Override
  public boolean push(T data) {
    stack.addAtTail(data);
    size ++;
    return true;
  }

  @Override
  public T pop() {
    T data = null;

    if(size != 0) {
      data = stack.removeAtTail();
      size --;
    }

    return data;
  }

  @Override
  public boolean isEmpty() {
    return size == 0 ? true : false;
  }

  @Override
  public Integer size() {
    return size;
  }
}
