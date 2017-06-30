/**  
 * This class analize your sequence if it is non-decreasing.
 */
public class AnalizeSequence {

  /**
   * This method determines if the sequence is non-decreasing or not
   * and puts the answer to the console.
   *
   * @param sequenceStringDivided checking sequence
   */
  public void determineSequence(String[] sequenceStringDivided) {
    try {
      for (int i = 0; i + 1 < sequenceStringDivided.length ; i++) {
        if (Integer.parseInt(sequenceStringDivided[i]) > Integer.parseInt(sequenceStringDivided[i + 1])) {
          System.out.println("Your sequence is not non-decreasing");
          return;
        }
      }
    } catch (NumberFormatException e) {
      System.out.println("You entered a wrong symbol");
    }
    System.out.println("Your sequence is non-decreasing");
  }
}
