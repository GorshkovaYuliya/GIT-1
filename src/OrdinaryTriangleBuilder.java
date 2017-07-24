import java.math.BigDecimal;
/**
 * This class is heir of TriangleBuilder.
 * It tries to build ordinary triangle.
 */
public class OrdinaryTriangleBuilder extends TriangleBuilder {
  public OrdinaryTriangleBuilder(TriangleBuilder successor) {
    super();
    this.successor = successor;
  }

  /**
   * Tries to build ordinary triangle
   * @param sides is sides of triangle
   * @return build ordinary triangle
   * @throws IllegalTriangleException if triangle can't be build
   * @throws IllegalTypeTriangleException if triangle is not ordinary
   */
  public Triangle buildTriangle(BigDecimal[] sides) throws IllegalTriangleException, IllegalTypeTriangleException {
    try {
      return new Triangle(sides);
    } catch (IllegalTriangleException exc) {
      if (successor != null) {
        return successor.buildTriangle(sides);
      } else throw new IllegalTriangleException();
    }
  }
}


