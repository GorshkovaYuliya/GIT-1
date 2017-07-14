import java.util.Scanner;
/**
 * This class contains person's data.
 */
public class Personas {
  private String firstName;
  private String secondName;
  private String patronomic;
  private String age;
   
  /**
   * Constructor.
   * 
   * @param firstName name of the person. 
   * @param secondName surname of the person.
   * @param patronomic is patronomic of person.
   * @param age is age of person.
   */
  public Personas(String firstName, String secondName, String patronomic, String age) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.patronomic = patronomic;
    setAge(age);
  }
  
  /**
   * Setter.
   *
   * @param age is age of person.
   */
  public void setAge(String age) {
    this.age = age;
    while (!(isAgeCorrect(age))) {
      throw new IllegalArgumentException();
    }
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public String getSecondName() {
    return secondName;
  }
  
  public String getPatronomic() {
    return patronomic;
  }
  
  public String getAge() {
    return age;
  }
   
  /**
   * This metod check age value on correctness.
   *
   * @return true if age value if is positive
   * and smaller than 150, otherwise returns false.   
   */
  public boolean isAgeCorrect(String age) {
    if ((Integer.parseInt(age) < 0) || (Integer.parseInt(age) > 150)) {
      return false;
    }
    return true;
  } 
}
