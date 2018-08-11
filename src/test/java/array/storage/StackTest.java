package array.storage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {

  int[] data;
  int[] expectedData;
  Stack stack;
  @BeforeEach
  void setUp() {
   data = new int[5];
    expectedData = new int[]{3, 5, 6, 7, 8};
    stack = new Stack(5);
  }

  @Test
  void testStack() {
    stack.push(3);
    stack.push(5);
    stack.push(6);
    stack.push(7);
    stack.push(8);
    Assertions.assertArrayEquals(expectedData, stack.getData());
  }

  @Test
  void testPop() {
    stack.push(3);
    stack.push(5);
    Assertions.assertEquals(5, stack.pop());
    Assertions.assertEquals(3, stack.pop());
  }

  @Test
  void testPeek() {
    stack.push(7);
    stack.push(8);
    Assertions.assertEquals(8, stack.peek());
    Assertions.assertEquals(8, stack.peek());
  }
}
