package converters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BaseConverterTest {

  BaseConverter baseConverter;

  @BeforeEach
  void setup() {
    baseConverter = new BaseConverter();
  }

  @Test
  void hexToDecimal() {
    int result = baseConverter.baseToDecimal("3E8", 16);
    Assertions.assertEquals(1000, result);
  }

  @Test
  void octToDecimal() {
    int result = baseConverter.baseToDecimal("1750", 8);
    Assertions.assertEquals(1000, result);
  }

  @Test
  void doubleHexToDecimal(){
    int result = baseConverter.baseToDecimal("68", 32);
    Assertions.assertEquals(200, result);
  }

  @Test
  void decimalToHex() {
    String result = baseConverter.decimalToBase(1000, 16);
    Assertions.assertEquals("3E8", result);
  }

  @Test
  void decimalToOct() {
    String result = baseConverter.decimalToBase(1000, 8);
    Assertions.assertEquals("1750", result);
  }

  @Test
  void decimalToDoubleHex() {
    String result = baseConverter.decimalToBase(200, 32);
    Assertions.assertEquals("68", result);
  }

}
