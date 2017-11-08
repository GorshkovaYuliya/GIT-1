import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class run the third criterion.
 * Its perform specific tasks as
 * solve the problem distribution of workers
 */
public class ThirdCriterian extends Employees {
  public ThirdCriterian(double employeesSalary, double employeesProductivity) {
    super(employeesSalary, employeesProductivity);
  }

  /**
   * This function solve a linear linear
   * equation with one constraint
   * @param productive fixed productivity
   * @param middle object type employees
   * @param senior object type employees
   * @param lead object type employees
   * @return result, an array includes amount of every type
   * of employees and minimized function
   */
  public ArrayList<BigDecimal> branchAndBoundMethodMinimizeEmployees(BigDecimal productive, Employees middle, Employees senior, Employees lead) {
    ArrayList<BigDecimal> result = new ArrayList<>();
    ArrayList<BigDecimal> objectiveFunctionThroughFreeVariables = new ArrayList<BigDecimal>(Collections.nCopies(3, BigDecimal.ZERO));
    objectiveFunctionThroughFreeVariables.set(0, productive.divide( middle.getProductivity()));
    objectiveFunctionThroughFreeVariables.set(1, senior.getProductivity().divide(middle.getProductivity()));
    objectiveFunctionThroughFreeVariables.set(2, lead.getSalary().divide(middle.getSalary()));
    ArrayList<BigDecimal> objectiveFunction = new ArrayList<BigDecimal>(Collections.nCopies(3, BigDecimal.ZERO));
    objectiveFunction.set(0,middle.getProductivity());
    objectiveFunction.set(1,senior.getProductivity());
    objectiveFunction.set(2,lead.getProductivity());
    ArrayList<BigDecimal> variableNumberZero = new ArrayList<BigDecimal>(Collections.nCopies(3, BigDecimal.ZERO));
    variableNumberZero.set(0,(objectiveFunction.get(0).subtract(objectiveFunction.get(0).add(objectiveFunctionThroughFreeVariables.get(0)))));
    variableNumberZero.set(1,(objectiveFunction.get(1).subtract(objectiveFunction.get(0).add(objectiveFunctionThroughFreeVariables.get(1)))));
    variableNumberZero.set(2,(objectiveFunction.get(2).subtract(objectiveFunction.get(0).add(objectiveFunctionThroughFreeVariables.get(2)))));
    BigDecimal maximumVariableInArrayVariableNumberZero, maximumRatio;
    maximumVariableInArrayVariableNumberZero = variableNumberZero.get(0);
    maximumRatio = objectiveFunctionThroughFreeVariables.get(0).divide(objectiveFunctionThroughFreeVariables.get(2)) ;
    for(int i = 1; i < 3; i++ ) {
      if (maximumRatio.compareTo(objectiveFunctionThroughFreeVariables.get(i)) == -1) {
        maximumRatio = objectiveFunctionThroughFreeVariables.get(i);
      }
    }
    ArrayList<BigDecimal> seniorAmmount = new ArrayList<>();
    seniorAmmount.add(maximumRatio);
    seniorAmmount.add(BigDecimal.ONE.divide(objectiveFunctionThroughFreeVariables.get(1)));
    seniorAmmount.add(objectiveFunctionThroughFreeVariables.get(1).divide(objectiveFunctionThroughFreeVariables.get(0),2, RoundingMode.HALF_UP));
   // seniorAmmount.add(objectiveFunctionThroughFreeVariables.get(2).divide(objectiveFunctionThroughFreeVariables.get(0)));
    variableNumberZero.set(0,variableNumberZero.get(0).multiply(seniorAmmount.get(0)));
    variableNumberZero.set(1,variableNumberZero.get(0).multiply(seniorAmmount.get(1)));
    variableNumberZero.set(2,(variableNumberZero.get(0).multiply(seniorAmmount.get(2))).add(variableNumberZero.get(2)));
    BigDecimal optimalVariable = variableNumberZero.get(2);
    if(optimalVariable.compareTo(optimalVariable.setScale(0, RoundingMode.CEILING)) != 0) {
      BigDecimal optimalVariableMadeInteger = (optimalVariable.setScale(0, RoundingMode.CEILING)).subtract(BigDecimal.ONE);
      BigDecimal finalObjectiveFunction =  ((objectiveFunction.get(0).multiply(BigDecimal.ONE))).add(objectiveFunction.get(1).multiply(optimalVariableMadeInteger));
      result.add(BigDecimal.ONE);
      result.add(optimalVariableMadeInteger);
      result.add(finalObjectiveFunction);
      return result;
    }
    BigDecimal finalObjectiveFunction =  ((objectiveFunction.get(0).multiply(BigDecimal.ZERO))).add(objectiveFunction.get(1).multiply(optimalVariable));
    result.add(BigDecimal.ZERO);
    result.add(optimalVariable);
    result.add(BigDecimal.ZERO);
    result.add(finalObjectiveFunction);
    return result;
  }
}
