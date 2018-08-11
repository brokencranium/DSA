package array.operations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import array.operations.LinearOperations;

class LinearOperationsTest {

  int[] defaultArray;
  LinearOperations linearOps;

  @BeforeEach
  void init() {
    linearOps = new LinearOperations(10);
  }

  @Test
  void add() {
    setActualAddData();
    linearOps.add(10);
    linearOps.add(5);
    linearOps.add(20);
    linearOps.add(15);
    Assertions.assertArrayEquals(defaultArray, linearOps.getArray());
  }

  @Test
  void search() {
    linearOps.add(10);
    linearOps.add(5);
    linearOps.add(20);
    linearOps.add(15);
    Assertions.assertEquals(20, linearOps.search(20));
  }

  @Test
  void remove() {
    setActualRemoveData();
    linearOps.add(10);
    linearOps.add(5);
    linearOps.add(20);
    linearOps.add(15);
    linearOps.remove(5);
    Assertions.assertArrayEquals(defaultArray, linearOps.getArray());

  }

  private void setActualAddData() {
    defaultArray = new int[]{5, 10, 15, 20};
  }

  private void setActualRemoveData() {
    defaultArray = new int[]{10, 15, 20};
  }

}
