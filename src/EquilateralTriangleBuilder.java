import java.math.BigDecimal;

/**
 * This class is heir of TriangleBuilder.
 * It tries to build equilateral triangle.
 */
public class EquilateralTriangleBuilder extends TriangleBuilder {

  /**
   * Constructor.
   * @param successor points to the next type of triangle
   */
  public EquilateralTriangleBuilder(TriangleBuilder successor) {
    this.successor = successor;
  }

  @Override
  public Triangle buildSpecialTypeOfTheTriangle(BigDecimal[] sides) throws IllegalTypeTriangleException, IllegalTriangleException {
    return new EquilateralTriangle(sides);
  }
}
