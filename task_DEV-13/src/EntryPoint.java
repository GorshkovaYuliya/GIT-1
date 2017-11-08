import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * This is an entry point class
 */
public class EntryPoint {
  public static void main(String[] args){
    Employees junior = new Employees(100 ,15);
    Employees middle = new Employees(200,25);
    Employees senior = new Employees(500,250);
    Employees lead = new Employees(1000,350);
    FirstCriterian first = new FirstCriterian(100,150);
    SecondCriterian second = new SecondCriterian(100,150);
    ThirdCriterian third = new ThirdCriterian(100,150);
    ConsoleReader readFromConsole = new ConsoleReader();
    double budgetDouble = readFromConsole.consoleReadDouble("Enter budget:");
    BigDecimal budget = new BigDecimal(budgetDouble);
    double productivityDouble = readFromConsole.consoleReadDouble("Enter productivity:");
    BigDecimal productivity = new BigDecimal(productivityDouble);
    int answer  = readFromConsole.consoleReadInteger("Enter criterion");
    try {
      if (answer == 1) {
        System.out.println("Amount of juniors :" + first.branchAndBoundMethodMaksimize(budget, junior, middle, senior, lead).get(0));
        System.out.println("Amount of middles :" + first.branchAndBoundMethodMaksimize(budget, junior, middle, senior, lead).get(1));
        System.out.println("Amount of seniors :" + first.branchAndBoundMethodMaksimize(budget, junior, middle, senior, lead).get(2));
        System.out.println("Amount of leads :" + first.branchAndBoundMethodMaksimize(budget, junior, middle, senior, lead).get(3));
        System.out.println("Maximum productivity :" + first.branchAndBoundMethodMaksimize(budget, junior, middle, senior, lead).get(4));
      } else if (answer == 2) {
        System.out.println("Amount of juniors :" + second.branchAndBoundMethodMinimize(productivity, junior, middle, senior, lead).get(0));
        System.out.println("Amount of middles :" + second.branchAndBoundMethodMinimize(productivity, junior, middle, senior, lead).get(1));
        System.out.println("Amount of seniors :" + second.branchAndBoundMethodMinimize(productivity, junior, middle, senior, lead).get(2));
        System.out.println("Amount of leads :" + second.branchAndBoundMethodMinimize(productivity, junior, middle, senior, lead).get(3));
        System.out.println("Minimized budget :" + second.branchAndBoundMethodMinimize(productivity, junior, middle, senior, lead).get(4));
      } else if (answer == 3) {
        System.out.println("Amount of middles :" + third.branchAndBoundMethodMinimizeEmployees(productivity, middle, senior, lead).get(0));
        System.out.println("Amount of seniors :" + third.branchAndBoundMethodMinimizeEmployees(productivity, middle, senior, lead).get(1));
        System.out.println("Amount of leads :" + third.branchAndBoundMethodMinimizeEmployees(productivity, middle, senior, lead).get(2));
      }
    } catch (NumberFormatException e) {
      System.out.println("Criterion is wrong");
    }
  }
}
