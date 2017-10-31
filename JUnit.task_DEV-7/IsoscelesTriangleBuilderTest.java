import org.junit.Test;

import java.math.BigDecimal;

/**
 * This test class check if program catches all exceptions
 */
public class IsoscelesTriangleBuilderTest {
  BigDecimal[] sides = {new BigDecimal(1),new BigDecimal(2),new BigDecimal(3)};
  IsoscelesTriangleBuilder builder = new IsoscelesTriangleBuilder(null);

  @Test
  public void checkIfExceptionCatched() throws IllegalTypeTriangleException, IllegalTriangleException {
    try {
      builder.buildSpecialTypeOfTheTriangle(sides);
    } catch (IllegalTriangleException e){
    } catch (IllegalTypeTriangleException ex){
    }
  }
}