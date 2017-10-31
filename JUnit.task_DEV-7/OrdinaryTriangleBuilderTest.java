import org.junit.Test;
import java.math.BigDecimal;
/**
 * This test class check if program catches all exceptions
 */
public class OrdinaryTriangleBuilderTest {
  BigDecimal[] sides = {new BigDecimal(1),new BigDecimal(2),new BigDecimal(3)};
  OrdinaryTriangleBuilder builder  = new OrdinaryTriangleBuilder(null);

  @Test
  public void checkIfExceptionCatched() throws IllegalTypeTriangleException, IllegalTriangleException {
    try {
      builder.buildSpecialTypeOfTheTriangle(sides);
    } catch (IllegalTriangleException e){
    } catch (IllegalTypeTriangleException ex){
    }
  }
}