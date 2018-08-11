package array.storage;

public class DelimiterMatching {

  private StackChar stackChar;

  public DelimiterMatching(StackChar stackChar) {
    this.stackChar = stackChar;
  }

  public void addRemove(char delimiter) {

    switch (delimiter) {
      case '{':
      case '(':
      case '[':
      case '<':
        stackChar.push(delimiter);
        break;
      case '}':
        if (stackChar.canPop() && stackChar.peek() == '{') {
          stackChar.pop();
        }
        break;
      case ')':
        if (stackChar.canPop() && stackChar.peek() == '(') {
          stackChar.pop();
        }
        break;
      case ']':
        if (stackChar.canPop() && stackChar.peek() == '[') {
          stackChar.pop();
        }
        break;
      case '>':
        if (stackChar.canPop() && stackChar.peek() == '<') {
          stackChar.pop();
        }
        break;
      default:
        break;
    }
  }

  public boolean isDelimiterMatching() {
    return stackChar.size() < 0 ? true : false;
  }

  public char[] getData() {
    return stackChar.getData();
  }

  public int size() {
    return stackChar.size();
  }
}
