package array.storage;

public class ExpressionEvaluator {

  private char[] stack;
  private int size;
  private StringBuilder sb;
  private String operands = "/*+-";
  private int elementCount = -1;

  public ExpressionEvaluator(int size) {
    stack = new char[size];
    this.size = size;
    sb = new StringBuilder();
  }

  private ExpressionEvaluator() {
  }


  public boolean addToExpression(char input) {
    if (elementCount == size) {
      return false;
    }

    if (isValidOperand(input)) {
      sb.append(input);
    } else if (input == '(') {
      stack[++elementCount] = input;
    } else if (input == ')') {
      while (elementCount > -1 && stack[elementCount] != '(') {
        sb.append(stack[elementCount--]);
      }
      elementCount--; //remove ( from stack
    } else if (isValidOperator(input)) {
        while (elementCount > -1) {
          if (stack[elementCount] == '(') {
            break;
          } else if (isCurrOpHigher(input, stack[elementCount])) {
            break;
          } else {
            sb.append(stack[elementCount--]);
          }
        }
      stack[++elementCount] = input;
    }
    return true;
  }

  public String getPostFixExpression() {
    while (elementCount > -1) {
      sb.append(stack[elementCount--]);
    }
    return sb.toString();
  }

  private boolean isCurrOpHigher(char input1, char input2) {
    return operands.indexOf(input1) < operands.indexOf(input2);
  }

  private boolean isValidOperator(char input) {
    return (operands.indexOf(input) != -1);
  }

  private boolean isValidOperand(char input) {
    return (Character.getNumericValue(input) >= 10 && Character.getNumericValue(input) <= 35);
  }

}
