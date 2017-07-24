import java.math.BigDecimal;
/**
 * This class is heir of Triangle.
 * It checks if triangle is equilateral.
 */
public class EquilateralTriangle extends Triangle {

  /**
   * Constructor.
   * @param sides is triangles sides
   * @throws IllegalTriangleException if triangle can't be build
   * @throws IllegalTypeTriangleException if triangle is not equilateral
   */
  public EquilateralTriangle(BigDecimal[] sides) throws IllegalTriangleException, IllegalTypeTriangleException {
    super(sides);
    if (isExistEquilateralTriangle(sides)) {
    } else {
      throw new IllegalTypeTriangleException();
    }
  }

  /**
   * This method determines if triangle is equilateral
   * @param sides handling sides entered by user
   * @return true if triangle is equilateral, false otherwise
   */
  public boolean isExistEquilateralTriangle(BigDecimal[] sides) {
    if (!((sides[0].compareTo(sides[1]) == 0) && ((sides[0].compareTo(sides[2]) == 0)))) {
      return false;
    }
    return true;
  }

  @Override
  public String getTriangleType() {
    return "This triangle is equilateral";
  }
}
