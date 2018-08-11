package array.sorting;

public class BubbleSort {
  int[] sortArray;

   public void sort(){
    int lastElement = sortArray.length - 1;
    int temp;
    boolean isSorted;
      for (int i =0; i<sortArray.length -1;i++){
        isSorted = true;
        for( int j =0; j<lastElement; j++){
          if (sortArray[j] > sortArray[j+1]){
            temp = sortArray[j];
            sortArray[j] = sortArray[j+1] ;
            sortArray[j+1] = temp;
            isSorted = false;
          }
        }
        if (isSorted){
          return;
        }
        lastElement--;
      }

   }

  public int[] getSortedData() {
    return sortArray;
  }

  public void setUnsortedData(int[] sortArray) {
    this.sortArray = sortArray;
  }
}
