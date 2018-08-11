package array.operations;

public class BinaryOperations implements IArrays {

  int[] binaryArray;
  int elementCount;

  public BinaryOperations(int size) {
    binaryArray = new int[size];
  }

  private void BinaryOperations() {
  }

  public void add(int element) {
    int index = getMaxIndex(element);
    shiftArrayElements(index);
    binaryArray[index] = element;
    elementCount++;
  }

  public int search(int element) {
    int endIndex = elementCount - 1;
    int startIndex = 0;
    int maxCount = (int) Math.floor(Math.log(elementCount) / Math.log(2) + 1e-10) + 1;
    int index;
    while (maxCount >= 0) {
      index = (startIndex + endIndex) / 2;

      if (binaryArray[index] == element) {
        return index;
      } else if (binaryArray[index] < element) {
        startIndex = index + 1;
      } else if (binaryArray[index] > element) {
        endIndex = index - 1;
      }
      maxCount--;
    }
    return -1;
  }

  public void remove(int element) {
    int index = search(element);
    int duplicateCount = 0;
    for (int i = index; i <= elementCount; i++) {
      if (binaryArray[i] == element) {
        duplicateCount++;
        continue;
      }
      binaryArray[i - duplicateCount] = binaryArray[i];
    }

  }

  public int[] getArray() {
    return binaryArray;
  }

  private int getMaxIndex(int element) {
    for (int i = 0; i <= elementCount; i++) {
      if (binaryArray[i] >= element) {
        return i;
      }
    }
    return elementCount;
  }

  private void shiftArrayElements(int index) {
    for (int i = elementCount; i >= index; i--) {
      binaryArray[i + 1] = binaryArray[i];
    }
  }
}
