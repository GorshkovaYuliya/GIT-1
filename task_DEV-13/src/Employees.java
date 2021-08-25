import java.math.BigDecimal;

/**
 * This class create a parent class Emoloyees.
 */
public  class Employees {
BigDecimal salary;
BigDecimal productivity;
  public Employees(double employeesSalary, double employeesProductivity) {
  BigDecimal salaryOfEmployees = new BigDecimal(employeesSalary);
  BigDecimal productivityOfEmployees = new BigDecimal(employeesProductivity);
  this.salary = salaryOfEmployees;
  this.productivity = productivityOfEmployees;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public   BigDecimal getProductivity() {
    return productivity;
  }
}
