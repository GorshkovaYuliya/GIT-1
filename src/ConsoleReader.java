import java.math.BigDecimal;
import java.util.Scanner;

/**
 * This class get information entered by user from console.
 */
public class ConsoleReader {
  Scanner scanner =  new Scanner(System.in);

  /**
   * This method request user to enter Triangle sides from console.
   * @param output message to user.
   * @return sides entered by user sides.
   */
  public BigDecimal[] consoleRead(String output) {
    System.out.println(output);
    BigDecimal[] sides = new BigDecimal[3];
    for (int i = 0; i < 3; i++) {
      sides[i] = scanner.nextBigDecimal();
    }
    return sides;
  }

  /**
   * This method handle entered by user answer.
   * @param answer entered by user parameter and means if program will stop or not.
   * @return true if answer isn't NO and false otherwise.
   */
  public boolean isContinueEntering (String answer){
    String negativeAnswer = "No";
    return !answer.equals(negativeAnswer);
  }

  /**
   * This method reads entered by user answer.
   * @return answer entered by user line.
   */
  public String askUserToContinue() {
    System.out.println("Enter <Yes> to continue, press < No > otherwise");
    scanner =  new Scanner(System.in);
    return scanner.nextLine();
  }
}

