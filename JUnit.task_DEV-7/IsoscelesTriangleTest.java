import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

/**
 * This test class check if Isosceles triangle is exist
 */
public class IsoscelesTriangleTest {
  BigDecimal[] sides = {new BigDecimal(1),new BigDecimal(1),new BigDecimal(1)};
  IsoscelesTriangle triangle = new IsoscelesTriangle(sides);

  public IsoscelesTriangleTest() throws IllegalTriangleException, IllegalTypeTriangleException {
  }

  @Test
  public void checkIfExistEquilateralTriangle() {
    assertTrue(triangle.isExistIsoscelesTriangle(sides));
  }

}