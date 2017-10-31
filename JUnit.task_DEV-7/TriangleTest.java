import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;
/**
 * This test class check if triangle with current sides
 * is exist and check return type statement is right
 */
public class TriangleTest {
  BigDecimal[] sides = {new BigDecimal(1),new BigDecimal(2),new BigDecimal(3)};
  Triangle testTriangle = new Triangle(sides);

  public TriangleTest() throws IllegalTriangleException {
  }

  @Test
  public void CheckIfTheTriangleIsExist() throws Exception {
    assertTrue(testTriangle.isExist(sides));
  }

  @Test
  public void testIfReturnsRightTriangleType() throws Exception {
    assertEquals(testTriangle .getTriangleType(),"This triangle is ordinary");
  }
}