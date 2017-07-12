import java.util.Scanner;
/**
 * This class reads the data of the person  from the console
 */
public class ConsoleRead {

  /**
   * This method reads the  string data of the person  from the console
   *
   * @return  string data of person entered from console
   */
  public String consoleReadingString() {
    Scanner scanner = new Scanner(System.in);
	  String dataString = scanner.nextLine();
	  return dataString;
  }

  /**
   * This method reads the  integer data of the person  from the console
   *
   * @return  integer data of person entered from console
   */
  public int consoleReadingInteger() {
    Scanner scanner = new Scanner(System.in);
	  int dataInteger = scanner.nextInt();
	  return dataInteger;
  }
}
