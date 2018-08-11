package array.storage;

public class ReverseString {

  StackChar stack;

  public ReverseString(StackChar stack) {
    this.stack = stack;
  }

  public void addChar(char input) {
    stack.push(input);
  }

  public String reverse() {
    char[] stackData = new char[stack.size() + 1];
    int index = -1;
    while (stack.canPop()) {
      index++;
      stackData[index] = stack.pop();
    }
    return String.valueOf(stackData);
  }
}
