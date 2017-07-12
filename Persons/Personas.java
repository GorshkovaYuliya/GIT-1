import java.util.Scanner;
/*
 * This class contains person's data
 */
public class Personas {
  private String firstName;
  private String secondName;
  private String patronomic;
  private int age;
   
  /**
   * Constructor.
   * 
   * @param firstName name of the person. 
   * @param secondName surname of the person.
   * @param patronomic is patronomic of person.
   * @param age is age of person. Can take values from 0 till 150.
   * And age value must be positive.
   */
  public Personas (String firstName, String secondName, String patronomic, int age) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.patronomic = patronomic;
    this.age = age;
    Scanner scanner = new Scanner(System.in);
    while (!(isAgeCorrect(age))) {
	    System.out.println("You entered wrong values, plase enter again:");
		  age = scanner.nextInt();
		  setAge(age);
	  }
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
    if ((age < 0) || (age > 150)) {
      return false;
    }
    return true;
  }
  
   /*
   * This metod suggest user to enter data 
   *
   * @return personData name of entered data 
   */
  public String getPersonData(String personData, int serialNumber) { 
    System.out.println("Eneter the " + personData + " of the " + (serialNumber + 1) + " person:");
    return personData;
  }
}
