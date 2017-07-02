/**
 * This class check if the suequence is non-decreasing.
 * Pogramm propose user to enter sequence and suggest to enter again
 * if nothing was entered
 * the program requests a sequence from the console.
 *
 * @author Gorshkova Yuliya
 */
public class SequenceModifided {
  public static void main(String[] args) {
    AnalizeSequence sequenceCheck = new AnalizeSequence();
    ConsoleReading consoleRead = new ConsoleReading();
    String[] line = consoleRead.readConsole();
    if (args.length != 0) {
      sequenceCheck.determineSequence(line);
    } else {
      consoleRead.readConsole();
    }
  }
}