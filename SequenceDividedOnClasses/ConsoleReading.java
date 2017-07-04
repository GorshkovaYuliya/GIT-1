import java.util.Scanner;

/**
 * This class suggest user to enter  sequence.
 */
public class ConsoleReading {

  /**
   * This method read sequence enered by user and
   *
   *@return argumentsDivided entered sequence
   */
  public String readConsole () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter sequence and divide numbers by using space");
    String args = scanner.nextLine();
    String [] argumentsDivided = args.split(" ");
    return argumentsDivided ;
  }
}
