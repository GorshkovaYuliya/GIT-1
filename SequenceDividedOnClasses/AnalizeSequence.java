/**  
 * This class analize your sequence if it is non-decreasing.
 */
public class AnalizeSequence {
  
  /**
   * This method determines if the sequence is non-decreasing or not
   *
   * @param args checking sequence
   * @return false if the sequence is not non-decreasing
   * @return true if the sequence is non-decreasing
   */
  public boolean determineSequence(String[] sequenceStringDivided) {
    for (int i = 4; i < sequenceStringDivided.length - 1; i++) {
      if (Integer.parseInt(sequenceStringDivided[i]) > Integer.parseInt(sequenceStringDivided[i + 1])) {         
        return false;
      }
    } 
    return true;
  }  
}
