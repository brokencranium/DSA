package array.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import array.sorting.SelectionSort;

class SelectionSortTest {

  SelectionSort selection;
  int[] data;
  int[] expectedData;

  @BeforeEach
  void setUp() {
    expectedData = new int[]{3, 5, 6, 7, 8};

    data = new int[]{8, 7, 6, 3, 5};
    selection = new SelectionSort();
    selection.setUnsortedData(data);
  }

  @Test
  void sort() {
    selection.sort();
    Assertions.assertArrayEquals(expectedData, selection.getSortedData());
  }
}
