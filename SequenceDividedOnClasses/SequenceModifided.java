/**
 * Pogramm propose user to enter sequence and suggest to enter again
 * if nothing was entered or was entered wrong value.
 * Program analize entered sequence if it is non-decreasing.
 *
 * @author Gorshkova Yuliya
 */
public class SequenceModifided {
  public static void main(String[] args) {
    String[] sequenceForCheck = args;
    ConsoleReading consoleRead = new ConsoleReading();
    while(sequenceForCheck.length <= 1 || !(sequenceCheck.determineIsSequensCorrect(sequenceForCheck))) {
      System.out.println("You do not put enough or entered impermissible values");
      sequenceForCheck = consoleRead.readConsole();
    }
    AnalizeSequence sequenceCheck = new AnalizeSequence();
    if (sequenceCheck.determineSequence(sequenceForCheck)) {
      System.out.println("Your sequence is non-decreasing");
    } else {
      System.out.println("Your sequence is not non-decreasing");  
    }
  }
}
