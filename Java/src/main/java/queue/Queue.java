package queue;

/**
 * Created by mamu on 8/3/16.
 */
public interface Queue <T> {
  //size
  public int size();
  //dequeue
  public T dequeue();
  //enqueue
  public void enqueue(T data);
  //isEmpty
  public boolean isEmpty();
}
