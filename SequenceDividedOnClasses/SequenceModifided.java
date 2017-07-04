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
    ConsoleReading consoleRead = new ConsoleReading();
    AnalizeSequence sequenceCheck = new AnalizeSequence();
    String[] sequenceForCheck = args;
    if (args.length <= 1) {
      sequenceForCheck = consoleRead.readConsole();
    }
    while(sequenceForCheck.length <=1) {
      System.out.println("You do not put enough values");
      sequenceForCheck = consoleRead.readConsole();
    }
    try {
      sequenceCheck.determineSequence(sequenceForCheck);
      if (sequenceCheck.determineSequence(sequenceForCheck) == true) {
        System.out.println("Your sequence is non-decreasing");
      } else {
        System.out.println("Your sequence is not non-decreasing");  
      }

    } catch (NumberFormatException e) { 
      System.out.println("Wrong format of enetered line");
    }
  }
}
