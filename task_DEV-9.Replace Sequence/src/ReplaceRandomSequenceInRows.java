import java.util.Arrays;

/**
 * This class replace sequence in chosen row.
 */
public class ReplaceRandomSequenceInRows {
  private String firstSequence;
  private String secondSequence;

  public ReplaceRandomSequenceInRows(String firstSequence, String secondSequence) {
    this.firstSequence = firstSequence;
    this.secondSequence = secondSequence;
  }

  public String getFirstSequence() {
    return firstSequence;
  }

  public String getSecondSequence() {
    return secondSequence;
  }

  /**
   * This method check if the the row contains sequence.
   * @param checkingRow is checking row
   * @param assumedSequence is sequence which assumed a part of the row
   * @return true if the row contains sequence otherwise return false
   */
  public boolean isRowContainsSequence(String checkingRow, String assumedSequence) {
    return checkingRow.contains(assumedSequence);
  }

  /**
   * This method determine the boundaries
   * of the sequence in the row.
   * @param row which contains sequence
   * @param sequence is a sequence which boundaries are detect
   * @return boundariesOfASequence boundaries which is integer array
   */
  public int[] sequenceBoundariesInARow(String row, String sequence) {
    int[] boundariesOfASequence = new int[2];
    int firstEqualElement = 0;
    int lastEqualElement = 0;
    for (int i = 0; i < row.toCharArray().length; i++) {
      if (row.toCharArray()[i] == (sequence.toCharArray())[0]) {
        firstEqualElement = i;
        lastEqualElement = i + sequence.length();
        System.out.println(lastEqualElement);
        boundariesOfASequence[0] = firstEqualElement;
        boundariesOfASequence[1] = lastEqualElement;
      }
    }
    return boundariesOfASequence;
  }

  /**
   * This method insert written sequence into row.
   * @param row is a row, where sequence is insert
   * @param sequenceForAdd is sequence from the second row for inserting
   * @param boundaries is boundaries of the row, where sequence will put
   * @return resultOfCombining is a row, is a result of inserting
   */
  public String addSequence(String row, String sequenceForAdd, int[] boundaries ) {
    char[] partOfTheRowBeforeSequence = Arrays.copyOfRange(row.toCharArray(),0, boundaries[0]);
    char[] partOfTheRowAfterSequence = Arrays.copyOfRange(row.toCharArray(), boundaries[1], row.length());
    String resultOfCombining = ( String.valueOf(partOfTheRowBeforeSequence).concat(sequenceForAdd)).concat(String.valueOf(partOfTheRowAfterSequence));
    return resultOfCombining;
  }
}