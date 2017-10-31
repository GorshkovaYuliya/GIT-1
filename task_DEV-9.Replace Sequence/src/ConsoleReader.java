import java.util.Scanner;

/**
 * This class get information entered by user from console.
 */
public class ConsoleReader {

  /**
   * This method reads entered by user rows and sequences.
   * @return string type variables entered by user.
   */
  public String readDataFromTheConsole() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  /**
   * This method reads entered by user integer type variables.
   * @return integer type variables entered by user.
   */
  public Integer readDataFromTheConsoleInt() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }
}
