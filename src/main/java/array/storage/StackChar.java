package array.storage;

public class StackChar {

  private char[] data;
  private int index = -1;

  private StackChar() {
  }

  public StackChar(int size) {
    data = new char[size];
  }

  public char pop() {
    if (index != -1) {
      return data[index--];
    }
    return 0;
  }

  public boolean canPop() {
    return index > -1 ? true : false;
  }

  public int size() {
    return index;
  }

  public int peek() {
    return data[index];
  }

  public void push(char input) {
    if (index < data.length) {
      data[++index] = input;
    }
  }

  public char[] getData() {
    return data;
  }
}
