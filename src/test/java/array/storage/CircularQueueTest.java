package array.storage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CircularQueueTest {

  private CircularQueue queue;

  @BeforeEach
  void setUp() {
    queue = new CircularQueue(5);
  }

  @Test
  void basicQueue() {
    queue.insert('G');
    queue.insert('U');
    queue.insert('A');
    queue.insert('R');
    queue.insert('D');

    Assertions.assertEquals('G', queue.remove());
    Assertions.assertEquals('U', queue.remove());
    Assertions.assertEquals('A', queue.remove());
    Assertions.assertEquals('R', queue.remove());
    Assertions.assertEquals('D', queue.remove());
  }

  @Test
  void circularQueue() {
    queue.insert('G');
    queue.insert('U');
    queue.insert('A');
    queue.insert('R');
    queue.insert('D');
    Assertions.assertEquals('G', queue.remove());
    Assertions.assertEquals('U', queue.remove());
    Assertions.assertEquals('A', queue.remove());

    queue.insert('I');
    queue.insert('A');
    queue.insert('N');
    Assertions.assertEquals('R', queue.remove());
    Assertions.assertEquals('D', queue.remove());
    Assertions.assertEquals('I', queue.remove());
    Assertions.assertEquals('A', queue.remove());
    Assertions.assertEquals('N', queue.remove());
  }

  @Test
  void repeatCircularQueue(){
    queue.insert('G');
    queue.insert('U');
    queue.insert('A');
    queue.insert('R');
    queue.insert('D');
    Assertions.assertEquals('G', queue.remove());
    Assertions.assertEquals('U', queue.remove());
    Assertions.assertEquals('A', queue.remove());

    queue.insert('I');
    queue.insert('A');
    queue.insert('N');
    Assertions.assertEquals('R', queue.remove());
    Assertions.assertEquals('D', queue.remove());
    Assertions.assertEquals('I', queue.remove());
    Assertions.assertEquals('A', queue.remove());
    Assertions.assertEquals('N', queue.remove());

    queue.insert('S');
    queue.insert(' ');
    queue.insert('O');
    queue.insert('F');
    queue.insert(' ');
    Assertions.assertEquals('S', queue.remove());
    Assertions.assertEquals(' ', queue.remove());
    Assertions.assertEquals('O', queue.remove());
    Assertions.assertEquals('F', queue.remove());
    Assertions.assertEquals(' ', queue.remove());

    queue.insert('T');
    queue.insert('H');
    queue.insert('E');
    queue.insert(' ');
    queue.insert('G');
    Assertions.assertEquals('T', queue.remove());
    Assertions.assertEquals('H', queue.remove());
    Assertions.assertEquals('E', queue.remove());
    Assertions.assertEquals(' ', queue.remove());
    Assertions.assertEquals('G', queue.remove());

    queue.insert('A');
    queue.insert('L');
    queue.insert('A');
    queue.insert('X');
    queue.insert('Y');
    Assertions.assertEquals('A', queue.remove());
    Assertions.assertEquals('L', queue.remove());
    Assertions.assertEquals('A', queue.remove());
    Assertions.assertEquals('X', queue.remove());
    Assertions.assertEquals('Y', queue.remove());
  }
}
