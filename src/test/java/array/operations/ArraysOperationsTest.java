package array.operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import array.operations.ArraysOperations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraysOperationsTest {

  int[] defaultArray;
  ArraysOperations arrayOps;

  @BeforeEach
  void init() {
    setActualAddData();
    arrayOps = new ArraysOperations(10);
  }

  @Test
  void testAdd() {
    arrayOps.add(5);
    arrayOps.add(15);
    arrayOps.add(10);
    arrayOps.add(35);
    assertArrayEquals(defaultArray, arrayOps.getArray());
  }

  @Test
  void testRemove() {
    setActualRemoveData();
    arrayOps.add(5);
    arrayOps.add(15);
    arrayOps.add(10);
    arrayOps.add(35);

    arrayOps.remove(10);
    assertArrayEquals(defaultArray, arrayOps.getArray());
  }

  @Test
  void testSearch() {
    setActualAddData();
    arrayOps.add(5);
    arrayOps.add(15);
    arrayOps.add(10);
    arrayOps.add(35);

    assertEquals(2, arrayOps.search(10));
  }

  private void setActualAddData() {
    defaultArray = new int[]{5, 15, 10, 35};
  }

  private void setActualRemoveData() {
    defaultArray = new int[]{5, 15, 35};
  }

}
