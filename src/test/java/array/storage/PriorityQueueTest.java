package array.storage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PriorityQueueTest {

  private PriorityQueue queue;

  @BeforeEach
  void setUp() {
    queue = new PriorityQueue(5);
  }

  @Test
  void add() {
    queue.add(2);
    queue.add(4);
    queue.add(1);
    queue.add(3);
    queue.add(5);
    int[] expectedQueue = new int[]{5, 4, 3, 2, 1};
    Assertions.assertArrayEquals(expectedQueue, queue.getQueue());
  }

  @Test
  void remove() {
    int[] expectedQueue;
    queue.add(2);
    queue.add(4);
    queue.add(1);
    queue.add(3);
    queue.add(5);

    Assertions.assertEquals(2, queue.remove());
    expectedQueue = new int[]{5, 4, 3, 1, 0};

    Assertions.assertEquals(expectedQueue, queue.remove());
    expectedQueue = new int[]{5, 4, 3, 0, 0};
    Assertions.assertEquals(expectedQueue, queue.remove());

    expectedQueue = new int[]{5, 4, 3, 0, 0};
    Assertions.assertArrayEquals(expectedQueue, queue.getQueue());
  }
}
