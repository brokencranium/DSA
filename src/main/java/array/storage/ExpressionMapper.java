package array.storage;

import java.util.HashMap;
import java.util.Map;

public class ExpressionMapper {

  private Map<Character, Object> mapper = new HashMap();
  private String operands = "/*+-";
  private int charIndex = 65;

  public boolean addToExpression(String input) {
    if (input.indexOf(input) == -1 && charIndex < 90) {
      mapper.put(Character.valueOf((char) charIndex++), input);
    } else {
      return false;
    }
    return true;
  }

}
