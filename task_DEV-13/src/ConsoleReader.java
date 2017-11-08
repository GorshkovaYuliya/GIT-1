import java.util.Scanner;

/**
 * This class allows user to enter data from console.
 */
public class ConsoleReader {
  /**
   * This method request user to enter data from console.
   * @param output message to user.
   * @return  double data entered by user size.
   */
  public double consoleReadDouble(String output) {
    Scanner scanner =  new Scanner(System.in);
    System.out.println(output);
    double data = scanner.nextDouble();
    scanner.nextLine();
    return data;
  }

  /**
   * This method request user to enter data from console.
   * @param output message to user.
   * @return integer data entered by user size.
   */
  public int consoleReadInteger(String output) {
    Scanner scanner =  new Scanner(System.in);
    System.out.println(output);
    int data = scanner.nextInt();
    scanner.nextLine();
    return data;
  }
}
