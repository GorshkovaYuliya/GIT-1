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
    super();
    this.successor = successor;
  }

  /**
   * Tries to build equilateral triangle
   * @param sides is sides of triangle
   * @return build equilateral triangle
   * @throws IllegalTriangleException if triangle can't be build
   * @throws IllegalTypeTriangleException if triangle is not equilateral
   */
  public Triangle buildTriangle(BigDecimal[] sides) throws IllegalTriangleException, IllegalTypeTriangleException {
    try {
      return new EquilateralTriangle(sides);
    } catch (IllegalTypeTriangleException e) {
      if (successor != null) {
        return successor.buildTriangle(sides);
      }
      throw new  IllegalTriangleException ( );
    }
  }
}

