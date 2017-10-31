import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * This test class check if program catches all exceptions
 */
public class EquilateralTriangleBuilderTest {
  BigDecimal[] sides = {new BigDecimal(1),new BigDecimal(1),new BigDecimal(1)};
  EquilateralTriangleBuilder builder  = new EquilateralTriangleBuilder(null);

  @Test
  public void checkIfExceptionCatchedInEquilateral() throws IllegalTypeTriangleException, IllegalTriangleException {
    try {
      builder.buildSpecialTypeOfTheTriangle(sides);
    } catch (IllegalTriangleException e){

    } catch (IllegalTypeTriangleException ex){

    }
  }
}
