import java.math.BigDecimal;
/**
 * This program checks entered sides if can be build triangle and
 * returns type of triangle.
 * @author Gorshkova Yuliya
 */
public class EntryPoint {

  public static void main(String[] args) {
    ConsoleReader consoleReader = new ConsoleReader();
    BigDecimal[] sides = new BigDecimal[3];
    String answer = "";
    do {
      try {
        sides = consoleReader.consoleRead("Enter sides of the triangle, please");
        TriangleBuilder build = new EquilateralTriangleBuilder
            (new IsoscelesTriangleBuilder(new OrdinaryTriangleBuilder(null)));
        Triangle triangle = build.buildTriangle(sides);
        System.out.println(triangle.getTriangleType());
      } catch (IllegalTriangleException ex) {
        System.out.println("Triangle is not exist");
      } catch (Exception e) {
        System.out.println("Entered values are not numbers");
      }
      answer = consoleReader.askUserToContinue();
    }
    while(consoleReader.isContinueEntering(answer));
    System.out.println("The program is finishing its work. Bye");
  }
}
