package main.java.doublylinkedlist;

/**
 * Created by mamu on 8/2/16.
 */
public class DoublyLinkedList<T> {

  private Node<T> head;
  private Node<T> tail;
  private Integer size;


  public DoublyLinkedList() {
    size = 0;
  }

  //add at head
  public void addAtHead(T data) {
    Node<T> node = new Node<>();


    //set node data
    node.setData(data);
    node.setNext(head);
    node.setPrevious(null);

    //set head
    if (head != null) {
      head.setPrevious(node);
    }

    //change node
    head = node;

    //check if tail is null
    if (tail == null) {
      tail = node;
    }

    size++;
  }

  //add at tail
  public void addAtTail(T data) {
    Node<T> node = new Node<>();

    //set node data
    node.setData(data);
    node.setNext(null);
    node.setPrevious(tail);

    //set tail
    if (null != tail) {
     tail.setNext(node);
    }
    //add to tail
    tail = node;

    if(head == null){
      head = null;
    }
    size++;
  }

  //remove at head
  public T removeAtHead(){
    T data = null;

    if(size == 0 && head == null) {
      return data;
    }

    Node<T> temp = head.getNext();
    data = head.getData();

    head = temp;
    head.setPrevious(null);

    size--;
    return data;
  }

  //remove at tail
  public T removeAtTail(){
    T data = null;

    if(size == 0 && tail == null) {
      return data;
    }

    Node<T> temp = tail.getPrevious();
    data = tail.getData();

    tail = temp;
    tail.setNext(null);
    size --;

    return  data;
  }

  //check if element exits
  public boolean checkElement(T data){

    if(null != getData(data)){
      return true;
    }
    return false;
  }

  public Node<T> getData(T data){

    Node<T> temp = head;
    Node<T> targetNode = null;
    while(temp != null) {
      if(temp.getData().equals(data)){
        targetNode = temp;
        break;
      }
      temp = temp.getNext();
    }
    return targetNode;
  }

  //remove first occurence of ele

}
