package array.operations;

public class LinearOperations implements IArrays {

  int[] linearArray;
  int elementCount;

  public LinearOperations(int size) {
    linearArray = new int[size];
  }

  private LinearOperations() {
  }

  public void add(int element) {
    int index = getMaxIndex(element);
    shiftArrayElements(index);
    linearArray[index] = element;
    elementCount++;
  }

  public int search(int element) {
    for (int i = 0; i <=elementCount; i++) {
      if (linearArray[i] == element) {
        return i;
      }
    }
    return -1;
  }

  public void remove(int element) {
    int index = search(element);
    int duplicateCount = 0;
    for (int i = index; i <= elementCount; i++) {
      if (linearArray[i] == element) {
          duplicateCount++;
          continue;
      }
      linearArray[i - duplicateCount] = linearArray[i];
    }
  }

  public void print() {

  }

  public int[] getArray() {
    return linearArray;
  }

  private int getMaxIndex(int element) {
    for (int i = 0; i <= elementCount; i++) {
      if (linearArray[i] >= element) {
        return i;
      }
    }
    return elementCount;
  }

  private void shiftArrayElements(int index) {
    for (int i = elementCount; i >= index; i--) {
      linearArray[i + 1] = linearArray[i];
    }
  }
}
