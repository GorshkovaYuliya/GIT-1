import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;
/**
 * This test class check if Equilateral triangle is exist
 */
public class EquilateralTriangleTest {
  BigDecimal[] sides = {new BigDecimal(1),new BigDecimal(1),new BigDecimal(1)};
  EquilateralTriangle triangle = new EquilateralTriangle(sides);

  public EquilateralTriangleTest() throws IllegalTriangleException, IllegalTypeTriangleException {
  }

  @Test
  public void checkIfExistEquilateralTriangle() {
    assertTrue(triangle.isExistEquilateralTriangle(sides));
  }
}