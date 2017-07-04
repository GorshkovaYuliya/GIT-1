
public class CheckSequenceRecursive {
  public void checkSequenceRecursive(String[] args) {
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