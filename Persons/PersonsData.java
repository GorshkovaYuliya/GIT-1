import java.util.Scanner;

/*
 * This programm formes a list of Person's 
 * data: firstname, secondname, patronomic,age
 *
 * @author Gorshkova Yuliya
 */
public class PersonsData {
  public static void main(String[] args) {
    try {
      System.out.println("Enter amount of data to be fill out");
      Scanner scanner = new Scanner(System.in);
      int amountOfData = scanner.nextInt();
      System.out.println("Fill in the data: ");
      Personas[] person = new Personas[amountOfData];
      for (int i = 0; i < amountOfData; i++) {
        scanner.nextLine();
        System.out.println("Eneter the firstname of the " + (i + 1) + " person:");
        String firstNameOfPerson = scanner.nextLine();
        System.out.println("Eneter the secondname of the " + (i + 1) + " person:");
        String secondNameOfPerson = scanner.nextLine();
        System.out.println("Eneter the patronymic of the " + (i + 1) + " person:");
        String patronomicOfPerson = scanner.nextLine();
        System.out.println("Eneter the age of the " + (i + 1) + " person:");
        int ageOfPerson = scanner.nextInt();
	person[i] = new Personas(firstNameOfPerson, secondNameOfPerson, patronomicOfPerson,ageOfPerson);
        while (!(person[i].isAgeCorrect(ageOfPerson))) {
	  System.out.println("You entered wrong values, plase enter again:");
	  ageOfPerson = scanner.nextInt();
	  person[i].setAge(ageOfPerson);
        }
      }
      for (int i = 0; i < amountOfData; i++) {
        System.out.println("Person number " + (i + 1));
        System.out.println( person[i].getFirstName() + " " + person[i].getSecondName() + " " + person[i].getPatronomic() + " " + person[i].getAge());
      }
    } catch (NumberFormatException e) {
      System.out.println("Wrong entered value");
      main(args);
    }
  }
}
