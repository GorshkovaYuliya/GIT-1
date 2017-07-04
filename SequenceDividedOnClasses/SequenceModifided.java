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
    CheckSequenceRecursive sequenceRecursive = new CheckSequenceRecursive();
    sequenceRecursive.checkSequenceRecursive(args);
    try {
      for (int i = 4; i < args.length - 1 ; i++) { 
        Integer.parseInt(args[i]);
	return;
       }
    } catch(NumberFormatException e) { 
        System.out.println("Wrong format of enetered line");
    }
  }
}
