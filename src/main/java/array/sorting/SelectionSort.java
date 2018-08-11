package array.sorting;

public class SelectionSort {

  int[] sortArray;

  public void sort() {
    int temp;
    int minIndex = 0;
    boolean isMin;
    for (int i = 0; i < sortArray.length; i++) {
      isMin = false;
      minIndex = i;
      for (int j = i; j < sortArray.length; j++) {
        if (sortArray[j] < sortArray[minIndex]) {
          minIndex = j;
          isMin = true;
        }
      }
      if (isMin) {
        temp = sortArray[i];
        sortArray[i] = sortArray[minIndex];
        sortArray[minIndex] = temp;
      }
    }
  }

  public int[] getSortedData() {
    return sortArray;
  }

  public void setUnsortedData(int[] sortArray) {
    this.sortArray = sortArray;
  }
}
