import java.math.BigDecimal;
/**
 * This class build triangle
 */
abstract class TriangleBuilder {
  private TriangleBuilder successor;

  public TriangleBuilder(){
    this.successor = successor;
  }
  
  /**
   * Tries to build triangle.
   * @param sides is sides of triangle
   * @return build triangle
   * @throws IllegalTriangleException if triangle can't be build
   * @throws IllegalTypeTriangleException if triangle type is invalid
   */
  public Triangle buildTriangle(BigDecimal[] sides) throws IllegalTriangleException, IllegalTypeTriangleException{
    try {
      return  buildSpecialTypeOfTheTriangle(sides);
    } catch (IllegalTypeTriangleException e) {
      if (successor != null) {
        return successor.buildTriangle(sides);
      }
      throw new  IllegalTriangleException ( );
    }
  }
  
  /**
   * Tries to build special type of triangle.
   * @param sides is sides of triangle
   */
  public abstract Triangle buildSpecialTypeOfTheTriangle(BigDecimal[] sides) throws IllegalTypeTriangleException, IllegalTriangleException;
}
