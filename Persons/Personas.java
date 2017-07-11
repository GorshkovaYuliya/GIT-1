/*
 * This class contains person's data
 */
public class Personas {
  private String firstName;
  private String secondName;
  private String patronomic;
  private int age;
  public Personas (String firstName, String secondName, String patronomic, int age) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.patronomic = patronomic;
    this.age = age;
  }
  public void setAge(int age) {
    this.age = age;
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
  public int getAge() {
    return age;
  }
   
  /*
   * This metod check age value on correctness
   *
   * @return true if age value is correct, and false otherwise 
   */
  public boolean isAgeCorrect(int age) {
    if ((age < 0) || (age > 150) || (age % 1 != 0)) {
      return false;
    }
    return true;
  }
}
