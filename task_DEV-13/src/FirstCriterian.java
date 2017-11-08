import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class perform specific tasks as
 * solve the problem of productivity and distribution of workers
 */
public class FirstCriterian  extends Employees {
  
  public FirstCriterian(double employeesSalary, double employeesProductivity) {
    super(employeesSalary, employeesProductivity);
  }

  /**
   * This function solve a linear equation
   * with one constraint with branch and bound algorithm
   * @param budget fixed budget
   * @param junior object type employees
   * @param middle object type employees
   * @param senior object type employees
   * @param lead object type employees
   * @return result, an array includes amount of every type
   * of employees and minimized function
   */
  public ArrayList<BigDecimal> branchAndBoundMethodMaksimize(BigDecimal budget,Employees junior, Employees middle, Employees senior, Employees lead) {
    ArrayList<BigDecimal> result = new ArrayList<>();
    ArrayList<BigDecimal> objectiveFunctionThroughFreeVariables = new ArrayList<BigDecimal>(Collections.nCopies(4, BigDecimal.ZERO));
    objectiveFunctionThroughFreeVariables.set(0, budget.divide( junior.getSalary()));
    objectiveFunctionThroughFreeVariables.set(1, middle.getSalary().divide(junior.getSalary()));
    objectiveFunctionThroughFreeVariables.set(2, senior.getSalary().divide(junior.getSalary()));
    objectiveFunctionThroughFreeVariables.set(3, lead.getSalary().divide(junior.getSalary()));
    ArrayList<BigDecimal> objectiveFunction = new ArrayList<BigDecimal>(Collections.nCopies(4, BigDecimal.ZERO));
    objectiveFunction.set(0,junior.getProductivity());
    objectiveFunction.set(1,middle.getProductivity());
    objectiveFunction.set(2,senior.getProductivity());
    objectiveFunction.set(3,lead.getProductivity());
    ArrayList<BigDecimal> variableNumberZero = new ArrayList<BigDecimal>(Collections.nCopies(4, BigDecimal.ZERO));
    variableNumberZero.set(0,(objectiveFunction.get(1).subtract(objectiveFunction.get(0).add(objectiveFunctionThroughFreeVariables.get(1)))));
    variableNumberZero.set(1,(objectiveFunction.get(2).subtract(objectiveFunction.get(0).add(objectiveFunctionThroughFreeVariables.get(2)))));
    variableNumberZero.set(2,(objectiveFunction.get(3).subtract(objectiveFunction.get(0).add(objectiveFunctionThroughFreeVariables.get(3)))));
    BigDecimal maximumVariableInArrayVariableNumberZero, maximumRatio;
    maximumVariableInArrayVariableNumberZero = variableNumberZero.get(0);
    maximumRatio = objectiveFunctionThroughFreeVariables.get(0).divide(objectiveFunctionThroughFreeVariables.get(1)) ;
    for(int i = 1; i < 4; i++ ) {
      if (maximumRatio.compareTo(objectiveFunctionThroughFreeVariables.get(i)) == -1) {
        maximumRatio = objectiveFunctionThroughFreeVariables.get(i);
      }
    }
    ArrayList<BigDecimal> middleAmmount = new ArrayList<>();
    middleAmmount.add(maximumRatio);
    middleAmmount.add(BigDecimal.ONE.divide(objectiveFunctionThroughFreeVariables.get(1)));
    middleAmmount.add(objectiveFunctionThroughFreeVariables.get(2).divide(objectiveFunctionThroughFreeVariables.get(1)));
    middleAmmount.add(objectiveFunctionThroughFreeVariables.get(3).divide(objectiveFunctionThroughFreeVariables.get(1)));
    variableNumberZero.set(0,variableNumberZero.get(0).multiply(middleAmmount.get(0)));
    variableNumberZero.set(1,variableNumberZero.get(0).multiply(middleAmmount.get(1)));
    variableNumberZero.set(2,(variableNumberZero.get(0).multiply(middleAmmount.get(2))).add(variableNumberZero.get(2)));
    variableNumberZero.set(3,(variableNumberZero.get(0).multiply(middleAmmount.get(3))).add(variableNumberZero.get(3)));
    BigDecimal optimalVariable = variableNumberZero.get(0);
    if(optimalVariable.compareTo(optimalVariable.setScale(0, RoundingMode.CEILING)) != 0) {
      BigDecimal optimalVariableMadeInteger = (optimalVariable.setScale(0, RoundingMode.CEILING)).subtract(BigDecimal.ONE);
      BigDecimal finalObjectiveFunction =  ((objectiveFunction.get(0).multiply(BigDecimal.ONE))).add(objectiveFunction.get(1).multiply(optimalVariableMadeInteger));
      result.add(BigDecimal.ONE);
      result.add(optimalVariableMadeInteger);
      result.add(BigDecimal.ZERO);
      result.add(BigDecimal.ZERO);
      result.add(finalObjectiveFunction);
      return result;
    }
    BigDecimal finalObjectiveFunction =  ((objectiveFunction.get(0).multiply(BigDecimal.ZERO))).add(objectiveFunction.get(1).multiply(optimalVariable));
    result.add(BigDecimal.ZERO);
    result.add(optimalVariable);
    result.add(BigDecimal.ZERO);
    result.add(BigDecimal.ZERO);
    result.add(finalObjectiveFunction);
    return result;
  }
}

