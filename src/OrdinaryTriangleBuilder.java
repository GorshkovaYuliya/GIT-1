import java.math.BigDecimal;
/**
 * This class is heir of TriangleBuilder.
 * It tries to build ordinary triangle.
 */
public class OrdinaryTriangleBuilder extends TriangleBuilder {
  public OrdinaryTriangleBuilder(TriangleBuilder successor) {
    this.successor = successor;
  }

  @Override
  public Triangle buildSpecialTypeOfTheTriangle(BigDecimal[] sides) throws IllegalTypeTriangleException, IllegalTriangleException {
    return new Triangle(sides);
  }
}
