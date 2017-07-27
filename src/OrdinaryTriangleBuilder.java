import java.math.BigDecimal;
/**
 * This class is heir of TriangleBuilder.
 * It tries to build ordinary triangle.
 */
public class OrdinaryTriangleBuilder extends TriangleBuilder {
  
    /**
   * Constructor.
   * @param successor points to the next type of triangle
   */
  public OrdinaryTriangleBuilder(TriangleBuilder successor) {
    this.successor = successor;
  }

  @Override
  public Triangle buildSpecialTypeOfTheTriangle(BigDecimal[] sides) throws IllegalTypeTriangleException, IllegalTriangleException {
    return new Triangle(sides);
  }
}
