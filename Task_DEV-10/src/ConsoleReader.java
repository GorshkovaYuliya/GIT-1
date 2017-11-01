import java.math.BigDecimal;
import java.util.Scanner;

/**
 * This class get information entered by user from console.
 */
public class ConsoleReader {
  Scanner scanner =  new Scanner(System.in);

  /**
   * This method request user to enter size of array from console.
   * @param output message to user.
   * @return sides entered by user size.
   */
  public int consoleRead(String output) {
    System.out.println(output);
    int sizeOfArray = scanner.nextInt();
    scanner.nextLine();
    return sizeOfArray;
  }
}