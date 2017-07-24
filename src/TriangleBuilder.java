import java.math.BigDecimal;

/**
 * Created by User on 21.07.2017.
 */
abstract class TriangleBuilder {
  protected TriangleBuilder successor;

  public abstract Triangle buildTriangle(BigDecimal[] sides) throws IllegalTriangleException, IllegalTypeTriangleException;
}
