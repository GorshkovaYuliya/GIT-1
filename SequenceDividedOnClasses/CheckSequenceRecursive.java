/**
 * This class is recursion
 */
public class CheckSequenceRecursive {

  /**
   * This method allows user to check sequence if user
   * enered it or call for console read method
   *
   * @param args checking sequence
   */
  public void dissectSequenceRecursive(String[] args) {
    AnalizeSequence sequenceCheck = new AnalizeSequence();
    if (args.length != 0) {
      if (sequenceCheck.determineSequence(args) == true) {
	System.out.println("Your sequence is non-decreasing");
      } else {
	System.out.println("Your sequence is not non-decreasing");  
      }
    } else {
      ConsoleReading consoleRead = new ConsoleReading();
      consoleRead.readConsole(); 
    }
  }
}
