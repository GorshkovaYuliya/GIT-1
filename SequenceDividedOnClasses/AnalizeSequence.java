/**  
 * This class analize your sequence if it is non-decreasing.
 */
public class AnalizeSequence {

  /**
   * This method  check entered sequence on mistakes
   *
   * @param sequenceStringDivided checking sequence
   * @exception NumberFormatException if e puts not integer numbers 
   */
  public void checkingSequenceOnMistakes(String[] sequenceStringDivided) {
    try {
      for (int i = 0; i < sequenceStringDivided.length - 1; i++) { 
        return;
      }
    } catch (NumberFormatException e) {
      System.out.println("You entered a wrong symbol");
    }
  }
  
  /**
   * This method determines if the sequence is non-decreasing or not
   *
   * @param sequenceStringDivided checking sequence
   * @return false if the sequence is not non-decreasing
   * @return true if the sequence is non-decreasing
   */
  public boolean determineSequence(String[] sequenceStringDivided) {
	  for (int i = 0; i < sequenceStringDivided.length - 1 ; i++) {
      if (Integer.parseInt(sequenceStringDivided[i]) > Integer.parseInt(sequenceStringDivided[i + 1])) {         
        return false;
      }
    } 
    return true;
  }  
}
