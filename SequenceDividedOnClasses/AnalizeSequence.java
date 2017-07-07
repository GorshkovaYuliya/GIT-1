/**  
 * This class analize your sequence if it is non-decreasing
 * and check if its elements are correct.
 */
public class AnalizeSequence {
  
  /**
   * This method determines if the sequence is non-decreasing or not
   *
   * @param args checking sequence
   * @return true if the sequence is non-decreasing
   */
  public boolean determineSequence(String[] args) {
    for (int i = 0; i < sequenceStringDivided.length - 1; i++) {
      if (Integer.parseInt(args[i]) > Integer.parseInt(args[i + 1])) {         
        return false;
      }
    } 
    return true;
  } 
  
  /**
   * This method determines if the sequence consists of correct elements
   *
   * @param args checking sequence
   * @return true if the sequence consists only of numbers
   */
  public boolean determineIsSequensCorrect(String[] args) {
    for (String currentElementOfMassive : args) {
      for (int i = 0; i < currentElementOfMassive.length(); i++) { 
        if (!Character.isDigit(currentElementOfMassive.charAt(i))) { 
          return false; 
        } 
      } 
    }
    return true; 
  }
}
