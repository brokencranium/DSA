package array.storage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

  ReverseString reverse;

  @BeforeEach
  void setUp() {
    reverse = new ReverseString(new StackChar(10));
  }

  @Test
  void reverse() {
    reverse.addChar('r');
    reverse.addChar('a');
    reverse.addChar('c');
    reverse.addChar('e');
    reverse.addChar('c');
    reverse.addChar('a');
    reverse.addChar('r');

    Assertions.assertEquals("racecar", reverse.reverse());
  }
}
