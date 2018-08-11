package array.operations;

import java.util.Random;

public class ArraysOperations implements IArrays {

  int[] array;
  int numberOfElements = 0;

  public ArraysOperations(int size) {
    array = new int[size];
  }

  private ArraysOperations() {
  }

  public void add(int value) {
    if (numberOfElements == array.length) {
      System.out.println("Array is full");
    }
    array[numberOfElements] = value;
    numberOfElements++;
  }

  public int search(int value) {
    for (int i = 0; i < numberOfElements; i++) {
      if (array[i] == value) {
        return i;
      }
    }
    return -1;
  }

  public void remove(int value) {
    int index = search(value);
    if (index >= 0) {
      for (int i = index; i < numberOfElements - 1; i++) {
        array[i] = array[i + 1];
        array[i + 1] = 0;
      }
      numberOfElements--;
    }
  }

  public int[] getArray() {
    return array;
  }

  public void initialize() {
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(500);
    }
    numberOfElements = array.length;
  }

  public void print() {
    for (int i = 0; i < numberOfElements; i++) {
      System.out.println("Array Index: " + i + " Array Value " + array[i]);
    }
  }
}
