import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Entry point class.
 */
public class EntryPoint {

  public static void main(String[] args) {
    ConsoleReader readFromConsole = new ConsoleReader();
    System.out.println("Hello. This program create random two-dimensional array, find equal elements and form array consists of them.");
    AnArrayConsistingOfIdenticalElementsOfOtherArrays array = new AnArrayConsistingOfIdenticalElementsOfOtherArrays();
    int lengthOfLines = readFromConsole.consoleRead("Enter the line length");
    int amountOfLines = readFromConsole.consoleRead("Enter amount of lines");
    ArrayList<ArrayList<BigDecimal>> fullArray  = new ArrayList<>();
    for(int i = 0; i < 1; i++) {
      fullArray.add(new ArrayList<BigDecimal>());
    }
    int sum = 0;
    while( sum != amountOfLines) {
      fullArray.add(array.fillArray(lengthOfLines));
      sum++;
    }
    fullArray.remove(0);
    System.out.println("Your two-dimensional array is:");
    for(int i = 0; i < amountOfLines; i++) {
      System.out.println(fullArray.get(i));
      System.out.println("\n");
    }
    System.out.println("An array that includes elements that are located at least in two arrays:");
    for(int i = 0; i < 1; i++) {
      array.sortSourceArrays(fullArray.get(i), lengthOfLines);
      array.deleteEqualElementsOfASingleLine(fullArray.get(i),lengthOfLines);
      System.out.println( array.formArray(array.concatenateAllLinesInASingleLine(fullArray.get(i))));
    }
  }
}
