import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class perform specific tasks as
 * solve the problem of budget and distribution of workers
 */
public class SecondCriterian extends Employees {

  public SecondCriterian(double employeesSalary, double employeesProductivity) {
    super(employeesSalary, employeesProductivity);
  }

  public int customerBudget(int budget ){
    return budget;
  }
  public int customerDesiredProductivity(int customerProductivity) {

    return customerProductivity;
  }

  /**
   * This function solve a linear equation
   * with one constraint with branch and bound algorithm
   * @param productive fixed productivity
   * @param junior object type employees
   * @param middle object type employees
   * @param senior object type employees
   * @param lead object type employees
   * @return result, an array includes amount of every type
   * of employees and minimized function
   */
  public ArrayList<BigDecimal> branchAndBoundMethodMinimize(BigDecimal productive, Employees junior, Employees middle, Employees senior, Employees lead) {
    ArrayList<BigDecimal> result = new ArrayList<>();
    ArrayList<BigDecimal> objectiveFunctionThroughFreeVariables = new ArrayList<BigDecimal>(Collections.nCopies(4, BigDecimal.ZERO));
    objectiveFunctionThroughFreeVariables.set(0, productive.divide(junior.getProductivity()));
    objectiveFunctionThroughFreeVariables.set(1, middle.getProductivity().divide(junior.getProductivity(),2, RoundingMode.HALF_UP));
    objectiveFunctionThroughFreeVariables.set(2, senior.getProductivity().divide(junior.getProductivity(),2, RoundingMode.HALF_UP));
    objectiveFunctionThroughFreeVariables.set(3, lead.getProductivity().divide(junior.getProductivity(),2, RoundingMode.HALF_UP));
    ArrayList<BigDecimal> objectiveFunction = new ArrayList<BigDecimal>(Collections.nCopies(4, BigDecimal.ZERO));
    objectiveFunction.set(0,junior.getSalary());
    objectiveFunction.set(1,middle.getSalary());
    objectiveFunction.set(2,senior.getSalary());
    objectiveFunction.set(3,lead.getSalary());
    ArrayList<BigDecimal> variableNumberZero = new ArrayList<BigDecimal>(Collections.nCopies(4, BigDecimal.ZERO));
    variableNumberZero.set(0,(objectiveFunction.get(1).subtract(objectiveFunction.get(0).add(objectiveFunctionThroughFreeVariables.get(1)))));
    variableNumberZero.set(1,(objectiveFunction.get(2).subtract(objectiveFunction.get(0).add(objectiveFunctionThroughFreeVariables.get(2)))));
    variableNumberZero.set(2,(objectiveFunction.get(3).subtract(objectiveFunction.get(0).add(objectiveFunctionThroughFreeVariables.get(3)))));
    BigDecimal minimumVariableInArrayVariableNumberZero, minimumRatio;
    minimumVariableInArrayVariableNumberZero = variableNumberZero.get(0);
    minimumRatio = objectiveFunctionThroughFreeVariables.get(0).divide(objectiveFunctionThroughFreeVariables.get(1),2, RoundingMode.HALF_UP) ;
    for(int i = 1; i < 4; i++ ) {
      if (minimumVariableInArrayVariableNumberZero.compareTo(objectiveFunctionThroughFreeVariables.get(i)) == -1) {
        minimumRatio = objectiveFunctionThroughFreeVariables.get(i);
      }
    }
    ArrayList<BigDecimal> middleAmmount = new ArrayList<>();
    middleAmmount.add(minimumRatio);
    middleAmmount.add(BigDecimal.ONE.divide(objectiveFunctionThroughFreeVariables.get(1),2, RoundingMode.HALF_UP));
    middleAmmount.add(objectiveFunctionThroughFreeVariables.get(2).divide(objectiveFunctionThroughFreeVariables.get(1),2, RoundingMode.HALF_UP));
    middleAmmount.add(objectiveFunctionThroughFreeVariables.get(3).divide(objectiveFunctionThroughFreeVariables.get(1),2, RoundingMode.HALF_UP));
    variableNumberZero.set(0,variableNumberZero.get(0).multiply(middleAmmount.get(0)));
    variableNumberZero.set(1,variableNumberZero.get(0).multiply(middleAmmount.get(1)));
    variableNumberZero.set(2,(variableNumberZero.get(0).multiply(middleAmmount.get(2))).add(variableNumberZero.get(2)));
    variableNumberZero.set(3,(variableNumberZero.get(0).multiply(middleAmmount.get(3))).add(variableNumberZero.get(3)));
    BigDecimal optimalVariable = variableNumberZero.get(0);
    if(optimalVariable.compareTo(optimalVariable.setScale(0, RoundingMode.CEILING)) != 0) {
      BigDecimal optimalVariableMadeInteger = (optimalVariable.setScale(0, RoundingMode.CEILING)).subtract(BigDecimal.ONE);
      BigDecimal finalObjectiveFunction =  ((objectiveFunction.get(0).multiply(BigDecimal.ONE))).add(objectiveFunction.get(3).multiply(optimalVariableMadeInteger));
      result.add(BigDecimal.ONE);
      result.add(BigDecimal.ZERO);
      result.add(BigDecimal.ZERO);
      result.add(optimalVariableMadeInteger);
      result.add(finalObjectiveFunction);
      return result;
    }
    BigDecimal finalObjectiveFunction =  ((objectiveFunction.get(0).multiply(BigDecimal.ZERO))).add(objectiveFunction.get(1).multiply(optimalVariable));
    result.add(BigDecimal.ZERO);
    result.add(BigDecimal.ZERO);
    result.add(BigDecimal.ZERO);
    result.add(optimalVariable);
    result.add(finalObjectiveFunction);
    return result;
  }
}
