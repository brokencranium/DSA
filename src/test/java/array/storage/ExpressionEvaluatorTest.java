package array.storage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExpressionEvaluatorTest {

  private ExpressionEvaluator evaluator;
  private String expectedPostFix;

  private static void setInfixExpression(ExpressionEvaluator evaluator, String infixValue) {
    int i = -1;
    int infixLength = infixValue.length() - 1;
    while (i < infixLength) {
      evaluator.addToExpression(infixValue.charAt(++i));
    }
  }

  @BeforeEach
  void setUp() {
    evaluator = new ExpressionEvaluator(15);
  }

  @Test
  void getPostFixExpression1() {
    expectedPostFix = "AB+C-";
    setInfixExpression(evaluator, "A+B-C");
    String postFixExpression = evaluator.getPostFixExpression();
    Assertions.assertTrue(expectedPostFix.equals(postFixExpression.toString()));
  }

  @Test
  void getPostFixExpression2() {
    expectedPostFix = "ABC*+";
    setInfixExpression(evaluator, "A+B*C");
    Assertions.assertEquals(expectedPostFix, evaluator.getPostFixExpression());
  }

  @Test
  void getPostFixExpression3() {
    expectedPostFix = "ABC+*";
    setInfixExpression(evaluator, "A*(B+C)");
    Assertions.assertEquals(expectedPostFix, evaluator.getPostFixExpression());
  }

  @Test
  void getPostFixExpression4() {
    expectedPostFix = "ABCD-*+";
    setInfixExpression(evaluator, "A+B*(C-D)");
    Assertions.assertEquals(expectedPostFix, evaluator.getPostFixExpression());
  }

}
