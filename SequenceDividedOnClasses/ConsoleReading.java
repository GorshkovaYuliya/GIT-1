import java.util.Scanner;

/**
 * This class suggest user to enter  sequence.
 */
public class ConsoleReading {

  /**
   * This method read sequence enered by user and
   * divided it on separate symbols.
   *
   *@return sequenceStringDivided entered and divided sequence
   */
  public String[] readConsole () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter sequence and divide numbers by using space");
    String sequenceString = scanner.nextLine();
    String[] sequenceStringDivided = sequenceString.split(" ");
    return sequenceStringDivided;
  }
}
