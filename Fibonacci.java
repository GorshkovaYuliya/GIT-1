import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("This programm checks your numer if this is non-negative Fibonacci number");
    System.out.println("Enter the  number of the line");
    Scanner in = new Scanner(System.in);
    int CheckFib = in.nextInt();
    double FibNumb = 0;
    int i = 0;
    while (FibNumb < CheckFib) {
      double OperationSqrt = Math.sqrt(5);
      double UseSqrt = (1 + OperationSqrt) / 2;
      FibNumb = Math.round(Math.pow(UseSqrt, i) / OperationSqrt);
      i++;
    } if (CheckFib == FibNumb && CheckFib >= 0) {
      System.out.println("This number belongs to positive Fibonacci line");
    } else {
      System.out.println("This is not positive Fibonacci number");
    }
  }
}
