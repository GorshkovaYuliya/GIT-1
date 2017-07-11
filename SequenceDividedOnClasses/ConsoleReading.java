import java.util.Scanner;

/**
 * Reads sequence entered by a user from the console.
 */
public class ConsoleReading {

  /**
   * This method read sequence enered by user
   *
   * @return argumentsDivided entered sequence
   */
  public String readConsole () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter sequence more than one element and divide numbers by using space");
    String args = scanner.nextLine();
    String [] argumentsDivided = args.split(" ");
    return argumentsDivided ;
  }
}
