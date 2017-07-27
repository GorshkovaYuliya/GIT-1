import java.math.BigDecimal;
/**
 * This class is heir of TriangleBuilder.
 * It tries to build isosceles triangle.
 */
public class IsoscelesTriangleBuilder extends TriangleBuilder {

  /**
   * Constructor.
   * @param successor points to the next type of triangle
   */
  public IsoscelesTriangleBuilder(TriangleBuilder successor) {
    this.successor = successor;
  }

  @Override
  public Triangle buildSpecialTypeOfTheTriangle(BigDecimal[] sides) throws IllegalTypeTriangleException, IllegalTriangleException {
    return new IsoscelesTriangle(sides);
  }
}
