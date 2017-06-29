import java.util.Scanner;

public class SequenceModifided {
  public static void main(String[] args) {
    if (args.length != 0) { 
      determineSequence(args);
    } else {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please, enter sequence and divide numbers by using space");
      String sequenceString = scanner.nextLine();
      String[] sequenceStringDivided = sequenceString.split(" ");
      determineSequence(sequenceStringDivided);
    }
  }
  
  /** 
   * This method determines if the sequence is non-decreasing or not
   * and puts the answer to the console.
   * @param sequenceStringDivided accepts a user-entered string 
   */
  public static void determineSequence(String[] sequenceStringDivided) {
    try {
      for (int i = 0; i + 1 < sequenceStringDivided.length ; i++) {
        if (Integer.parseInt(sequenceStringDivided[i]) > Integer.parseInt(sequenceStringDivided[i + 1])) {
          System.out.println("Your sequence is not non-decreasing");
          return;
        }        
      }
    } catch (NumberFormatException e) {
      System.out.println("You entered a wrong symbol");
    }
    System.out.println("Your sequence is non-decreasing");
  }   
}
