package stack;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by mamu on 8/3/16.
 */
public class StackTest {

  @Test
  public void testStackPush(){
    Stack<Integer> stack = new StackImp<>();
    stack.push(1);

    assertEquals(stack.size(), Integer.valueOf(1));
    assertEquals(stack.pop(), Integer.valueOf(1));
  }

  @Test
  public void testEmptyTest(){
    Stack<Integer> stack = new StackImp<>();

    assertEquals(stack.size(), Integer.valueOf(0));
    assertNull(stack.pop());
  }

  @Test
  public void testSingleElementTest(){
    Stack<Integer> stack = new StackImp<>();
    stack.push(1);

    assertEquals(stack.pop(), Integer.valueOf(1));
    assertNull(stack.pop());
    assertEquals(stack.size(), Integer.valueOf(0));
  }

}
