import java.util.Scanner;
/**
 * This class reads the data of the person  from the console
 *
 * @return data read from console
 */
public class ConsoleRead {
  public String consoleReading(String fieldName) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(fieldName);
    return scanner.nextLine();
  } 
}
