package queue;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by mamu on 8/4/16.
 */
public class QueueTest {

  @Test
  public void testQueue(){
    Queue<Integer> queue = new QueueImp<>();
    queue.enqueue(1);

    assertEquals(queue.size(), 1);
    assertEquals(queue.dequeue(), Integer.valueOf(1));
    assertNull(queue.dequeue());
  }

  @Test
  public void testSingleQueue(){

  }
}
