package converters;

public class BaseConverter {

  private static final String
      baseMap =
      "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

  public static void main(String[] args) {
    BaseConverter con = new BaseConverter();
    con.decimalToBase(104, 8);
  }

  public int baseToDecimal(String input, int base) {
    StringBuilder sb = new StringBuilder(input);
    String num = sb.reverse().toString();
    int total = 0;

    for (int i = 0; i < num.length(); i++) {
      total = (int) (total + baseMap.indexOf(num.charAt(i)) * Math.pow(base, i));
      System.out.println("Total: " + total + " Char : " + num.charAt(i) + " Character at Index: "
                         + baseMap.indexOf(num.charAt(i)) + " Exp: " + Math.pow(base, i));
    }
    return total;
  }

  public String decimalToBase(int input, int base) {
    int quotient = input;
    int remainder;
    StringBuilder sb = new StringBuilder();
    while (quotient >= 1) {
      remainder = quotient % base;
      quotient = quotient / base;

      System.out.println("Quotient: " + quotient + " Remainder:" + remainder);
      sb.append(baseMap.charAt(remainder));
    }
    String result = sb.reverse().toString();
    System.out.println("Base :" + base + " Value: " + result);

    return result;
  }
}
