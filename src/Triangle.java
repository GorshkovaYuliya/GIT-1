import java.math.*;

/**
 * This class checks if triangle is exist
 * and return
 */
public class Triangle {
  private BigDecimal[] sides;

  /**
   * Constructor.
   * @param sidesOfTriangle is sides of triangle
   * @throws IllegalTriangleException if triangle is not exist
   */
  public Triangle(BigDecimal[] sidesOfTriangle) throws IllegalTriangleException {
    if (isExist(sidesOfTriangle)) {
      this.sides = sidesOfTriangle;
    } else {
      throw new IllegalTriangleException();
    }
  }

  public BigDecimal[] getSides() {
    return sides;
  }

  /**
   * This method checks if triangle is exist.
   * @param sidesOfTriangle is sides of triangle.
   * @return true if triangle can be built and false otherwise.
   */
  public boolean isExist(BigDecimal[] sidesOfTriangle) {
    if ((((sidesOfTriangle[0].add(sidesOfTriangle[1])).compareTo(sidesOfTriangle[2])) == - 1) ||
        (((sidesOfTriangle[0].add(sidesOfTriangle[2])).compareTo(sidesOfTriangle[1])) == - 1) ||
        (((sidesOfTriangle[1].add(sidesOfTriangle[2])).compareTo(sidesOfTriangle[0])) == -1)) {
      return false;
    }
    for (int i = 0; i < 3; i++ ) {
      if ((sidesOfTriangle[i].compareTo(BigDecimal.ZERO)) == -1) {
        return false;
      }
    }
    return true;
  }

  /**
   * This method output type of triangle
   * @return line that means what type triangle is
   */
  public String getTriangleType() {
    return "This triangle is ordinary";
  }
}
