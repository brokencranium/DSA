package array.storage;

public class Stack {

  int[] data;
  int index = -1;

  private Stack() {
  }

  public Stack(int size) {
    data = new int[size];
  }

  public int pop() {
    if (index != -1) {
      return data[index--];
    }
    return Integer.MIN_VALUE;
  }

  public int peek() {
    return data[index];
  }

  public void push(int input) {
    if (index < data.length) {
      data[++index] = input;
    }
  }

  public int[] getData() {
    return data;
  }
}
