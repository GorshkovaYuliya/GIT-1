import java.math.BigDecimal;

/**
 * This class is heir of TriangleBuilder.
 * It tries to build equilateral triangle.
 */
public class EquilateralTriangleBuilder extends TriangleBuilder {

  /**
   * This method set pointer on the next type.
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
