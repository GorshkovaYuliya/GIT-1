import java.math.BigDecimal;
/**
 * This class is heir of Triangle.
 * It checks if triangle is equilateral.
 */
public class EquilateralTriangle extends Triangle {

  /**
   * This method tries to create equilateral triangle
   * if type is wrong calls an exception.
   * @param sides is triangles sides
   * @throws IllegalTriangleException if triangle can't be build
   * @throws IllegalTypeTriangleException if triangle is not equilateral
   */
  public isEquilateralTriangle(BigDecimal[] sides) throws IllegalTriangleException, IllegalTypeTriangleException {
    super(sides);
    if (!ExistEquilateralTriangle(sides)) {
      throw new IllegalTypeTriangleException();
    }
  }

  /**
   * This method determines if triangle is equilateral
   * @param sides handling sides entered by user
   * @return true if triangle is equilateral, false otherwise
   */
  public boolean isExistEquilateralTriangle(BigDecimal[] sides) {
    return (((sides[0].compareTo(sides[1]) == 0) && ((sides[0].compareTo(sides[2]) == 0))));
  }

  @Override
  public String getTriangleType() {
    return "This triangle is equilateral";
  }
}
