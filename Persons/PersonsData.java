/**
 * This programm formes a list of Person's:
 * data: firstname, secondname, patronomic, age.
 *
 * @author Gorshkova Yuliya
 */
public class PersonsData {
  public static void main(String[] args) {
    ConsoleRead readData = new ConsoleRead();
    int amountOfDataInteger = 0;
    boolean ifAmountOfDataCorrect = false;
    while (!ifAmountOfDataCorrect) {
      try {
        String amountOfData = readData.consoleReading("Enter amount of persons you whant to fill in: ");
        amountOfDataInteger = Integer.parseInt(amountOfData);
        ifAmountOfDataCorrect = true;
        break;
      } catch (NumberFormatException e) {
        System.out.println("Entered value is not number!");
        continue;
      }
    }
    Personas[] person = new Personas[amountOfDataInteger];
    for (int i = 0; i < amountOfDataInteger; i++) {
      String firstNameOfPerson = readData.consoleReading("Enter the firstname: ");
      String secondNameOfPerson = readData.consoleReading("Enter the secondname: ");
      String patronomicOfPerson = readData.consoleReading("Enter the patronomic: ");
      boolean ifAgeIsCorrect = false;
      while (!ifAgeIsCorrect) {
        try {
          String  ageOfPerson = readData.consoleReading("Enter the age: ");
          System.out.println(ageOfPerson);
          person[i] = new Personas(firstNameOfPerson, secondNameOfPerson, patronomicOfPerson, ageOfPerson);
          person[i].setAge(ageOfPerson);
          ifAgeIsCorrect = true;
          break;
        } catch (NumberFormatException en) {
          System.out.println("Entered value is not number!");
          continue;
        } catch (IllegalArgumentException ex) {
          System.out.println("The entered value is beyond human life or is negative!");
          continue;
        }
      }
      System.out.println("Person data is : " );  
      System.out.println( person[i].getFirstName() + " " + person[i].getSecondName() + " " + person[i].getPatronomic() + " " + person[i].getAge());
    }
  }
}
