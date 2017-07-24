import java.math.BigDecimal;
/**
 * This class is heir of Triangle.
 * It checks if triangle is equilateral.
 */
public class IsoscelesTriangle extends Triangle {

  /**
   * Constructor.
   * @param sides is triangles sides
   * @throws IllegalTriangleException if triangle can't be build
   * @throws IllegalTypeTriangleException if triangle is not equilateral
   */
  public IsoscelesTriangle(BigDecimal[] sides) throws IllegalTypeTriangleException, IllegalTriangleException {
    super(sides);
    if(!isExistIsoscelesTriangle(sides)) {
      throw new IllegalTypeTriangleException();
    }
  }

  /**
   * This method determines if triangle is isosceles
   * @param sides handling sides entered by user
   * @return true if triangle is isosceles, false otherwise
   */
  public boolean isExistIsoscelesTriangle(BigDecimal[] sides) {
    if ((sides[0].compareTo(sides[1]) != 0) && (sides[1].compareTo(sides[2]) != 0) &&
        ((sides[0].compareTo(sides[2]) != 0)) && (sides[2].compareTo(sides[1]) != 0)) {
      return false;
    }
    return true;
  }

  @Override
  public String getTriangleType() {
    return "This triangle is isosceles";
  }
}
