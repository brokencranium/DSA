package array.operations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import array.operations.BinaryOperations;

class BinaryOperationsTest {

  int[] defaultArray;
  BinaryOperations binaryOps;

  @BeforeEach
  void init() {
    binaryOps = new BinaryOperations(10);
  }

  @Test
  void add() {
    setActualAddData();
    binaryOps.add(11);
    binaryOps.add(5);
    binaryOps.add(20);
    binaryOps.add(15);
    Assertions.assertArrayEquals(defaultArray, binaryOps.getArray());
  }

  @Test
  void search() {
    binaryOps.add(11);
    binaryOps.add(5);
    binaryOps.add(20);
    binaryOps.add(15);
    Assertions.assertEquals(1, binaryOps.search(11));
    Assertions.assertEquals(0, binaryOps.search(5));
    Assertions.assertEquals(3, binaryOps.search(20));
    Assertions.assertEquals(2, binaryOps.search(15));
    Assertions.assertEquals(-1, binaryOps.search(30));
  }

  @Test
  void remove() {
    setActualRemoveData();
    binaryOps.add(11);
    binaryOps.add(5);
    binaryOps.add(20);
    binaryOps.add(15);
    binaryOps.remove(5);
    Assertions.assertArrayEquals(defaultArray, binaryOps.getArray());

  }

  private void setActualAddData() {
    defaultArray = new int[]{5, 11, 15, 20};
  }

  private void setActualRemoveData() {
    defaultArray = new int[]{11, 15, 20};
  }
}
