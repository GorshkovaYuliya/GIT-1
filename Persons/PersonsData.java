/*
 * This programm formes a list of Person's 
 * data: firstname, secondname, patronomic,age
 *
 * @author Gorshkova Yuliya
 */
public class PersonsData {
  public static void main(String[] args) {
    ConsoleRead readData = new ConsoleRead();
    System.out.println("Enter amount of data to be fill out");
    int amountOfData = readData.consoleReadingInteger();
    System.out.println("Fill in the data: ");
    Personas[] person = new Personas[amountOfData];Personas[] person = new Personas[amountOfData];
    Personas dataName = new Personas("", "", "", 0);
    for (int i = 0; i < amountOfData; i++) {
      String firstName = dataName.getPersonData("firstname", i);
      String firstNameOfPerson = readData.consoleReadingString();
      String secondName = dataName.getPersonData("secondname", i);
      String secondNameOfPerson = readData.consoleReadingString();
      String patronomic = dataName.getPersonData("patronomic", i);
      String patronomicOfPerson = readData.consoleReadingString();
      String age = dataName.getPersonData("age", i);
      int ageOfPerson = readData.consoleReadingInteger();
      person[i] = new Personas(firstNameOfPerson, secondNameOfPerson, patronomicOfPerson,ageOfPerson);
    }
    for (int i = 0; i < amountOfData; i++) {
      System.out.println("Person number " + (i + 1));
      System.out.println( person[i].getFirstName() + " " + person[i].getSecondName() + " " + person[i].getPatronomic() + " " + person[i].getAge());
    }
  }
}
