/**  
 * This class analize your sequence if it is non-decreasing.
 */
public class AnalizeSequence {

  /**
   * This method  check entered sequence if all symbols are numbers
   *
   * @param sequenceStringDivided checking sequence
   * @exception NumberFormatException if e puts not numbers
   * @return false if there is not only numbers
   * @return true if the sequence consists only of numbers
   */
  public boolean checkingSequenceOnNumbers(String[] sequenceStringDivided) {
    try {
      for (int i = 0; i < sequenceStringDivided.length - 1; i++) { 
        Integer.parseInt(sequenceStringDivided[i]);
      }
    } catch (NumberFormatException e) {
      System.out.println("You entered a wrong symbol");
      return false;
    }
    return true;
  }
  
  /**
   * This method determines if the sequence is non-decreasing or not
   *
   * @param sequenceStringDivided checking sequence
   * @return false if the sequence is not non-decreasing
   * @return true if the sequence is non-decreasing
   */
  public boolean determineSequence(String[] sequenceStringDivided) {
    for (int i = 0; i < sequenceStringDivided.length - 1; i++) {
      if (Integer.parseInt(sequenceStringDivided[i]) > Integer.parseInt(sequenceStringDivided[i + 1])) {         
        return false;
      }
    } 
    return true;
  }  
}
