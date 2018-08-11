package array.sorting;

public class InsertionSort {

  int[] sortArray;

  public void sort() {
    int temp;
    int j;
    for (int i = 0; i < sortArray.length; i++) {
      j = i - 1;
      temp = sortArray[i];
      while (j >= 0 && sortArray[j] > temp) {
         sortArray[j+1] = sortArray[j];
        j--;
      }
      sortArray[j+1] = temp;
    }
  }

  public int[] getSortedData() {
    return sortArray;
  }

  public void setUnsortedData(int[] sortArray) {
    this.sortArray = sortArray;
  }

}
