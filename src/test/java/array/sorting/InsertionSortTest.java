package array.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import array.sorting.InsertionSort;

class InsertionSortTest {

  InsertionSort insertion;
  int[] data;
  int[] expectedData;

  @BeforeEach
  void setUp() {
    expectedData = new int[]{3, 5, 6, 7, 8};

    data = new int[]{8, 7, 6, 5, 3};
    insertion = new InsertionSort();
    insertion.setUnsortedData(data);
  }

  @Test
  void sort() {
  insertion.sort();
    Assertions.assertArrayEquals(expectedData, insertion.getSortedData());
  }
}
