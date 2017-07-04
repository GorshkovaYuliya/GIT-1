import java.util.Scanner;

/**
 * This class suggest user to enter  sequence.
 */
public class ConsoleReading {

  /**
   * This method read sequence enered by user and
   * divided it on separate symbols.
   *
   *@return args entered sequence
   */
  public String readConsole () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter sequence and divide numbers by using space");
    String args = scanner.nextLine();
    CheckSequenceRecursive sequenceRecursive = new CheckSequenceRecursive();
    sequenceRecursive.checkSequenceRecursive(args.split(" "));
    return args;
  }
}
