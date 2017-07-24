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
    super();
    this.successor = successor;
  }

  /**
   * Tries to build isosceles triangle
   * @param sides is sides of triangle
   * @return built isosceles triangle
   * @throws IllegalTriangleException if triangle can't be build
   * @throws IllegalTypeTriangleException if triangle is not isosceles
   */
  public Triangle buildTriangle(BigDecimal[] sides) throws IllegalTriangleException, IllegalTypeTriangleException {
    try {
      return new IsoscelesTriangle(sides);
    } catch (IllegalTypeTriangleException e) {
      if (successor != null) {
        return successor.buildTriangle(sides);
      }
      throw new  IllegalTriangleException ( );
    }
  }
}

