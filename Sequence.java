import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter sequence and divide numbers by using space");
    String sequenceString = scanner.nextLine();
    String[] sequenceStringDivided = sequenceString.split(" ");
    try {
      for (int i = 0; i + 1 <sequenceStringDivided.length ; i++) {
        if (Integer.parseInt(sequenceStringDivided[i]) > Integer.parseInt(sequenceStringDivided[i + 1])) {
          System.out.println("Your sequence is not non-decreasing");
          return;
        }        
      }
    } catch (IllegalArgumentException e) {
      System.out.println("You entered a wrong symbol");
    }
    System.out.println("Your sequence is non-decreasing");
  }
}
