package array.storage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DelimiterMatchingTest {

  DelimiterMatching delimiter;

  @BeforeEach
  void setUp() {
    delimiter = new DelimiterMatching(new StackChar(10));
  }

  @Test
  void processDelimiter() {
    delimiter.addRemove('{');
    delimiter.addRemove('(');
    delimiter.addRemove('[');
    delimiter.addRemove('<');
    Assertions.assertEquals(3, delimiter.size());

    delimiter.addRemove('>');
    delimiter.addRemove(']');
    delimiter.addRemove(')');
    delimiter.addRemove('}');

    Assertions.assertEquals(true, delimiter.isDelimiterMatching());
  }
}
