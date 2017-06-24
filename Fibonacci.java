import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("This programm checks your number if this is non-negative Fibonacci number");
    System.out.println("Enter the  number of the line");
    Scanner in = new Scanner(System.in);
    int checkFib = in.nextInt();
    double fibNumb = 0;
    int i = 0;
    while (fibNumb < checkFib) {
      final double operationSqrt = Math.sqrt(5);
      double useSqrt = (1 + operationSqrt) / 2;
      fibNumb = Math.round(Math.pow(useSqrt, i) / operationSqrt);
      i++;
    } if (checkFib == fibNumb && checkFib >= 0) {
      System.out.println("This number belongs to positive Fibonacci line");
    } else {
      System.out.println("This is not positive Fibonacci number");
    }
  }
}
