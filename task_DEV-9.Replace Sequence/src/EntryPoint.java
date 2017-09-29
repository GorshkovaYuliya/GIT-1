/**
 * This program inserts any selected sequences from
 * any written by user row into any selected row.
 */
public class EntryPoint {

  public static void main(String[] args) {
    ConsoleReader consoleReader = new ConsoleReader();
    System.out.println("This program can replace randomly selected sequences between two rows");
    System.out.println("Enter two rows:");
    Rows rows = new Rows(consoleReader.readDataFromTheConsole(), consoleReader.readDataFromTheConsole());
    System.out.println("Entered rows:");
    System.out.println(rows.getFirstRow());
    System.out.println(rows.getSecondRow());
    int numberOfRow = 0;
    try {
      System.out.println("Choose the row, where you want to replace sequence: enter 1 or 2");
      numberOfRow = consoleReader.readDataFromTheConsoleInt();
    } catch (IllegalArgumentException e) {
      System.out.println("Entered values are wrong, rewrite");
      numberOfRow = consoleReader.readDataFromTheConsoleInt();
    }
    System.out.println("Enter sequences from the first and second rows:");
    ReplaceRandomSequenceInRows replaceRandomSequenceInRows = new ReplaceRandomSequenceInRows(
        consoleReader.readDataFromTheConsole(), consoleReader.readDataFromTheConsole());
    String changedRow = "";
    if (numberOfRow == (1)) {
      changedRow = replaceRandomSequenceInRows.addSequence(rows.getFirstRow(), replaceRandomSequenceInRows.getSecondSequence(),
          replaceRandomSequenceInRows.sequenceBoundariesInARow(rows.getFirstRow(), replaceRandomSequenceInRows.getFirstSequence()));
    } else {
      changedRow = replaceRandomSequenceInRows.addSequence(rows.getSecondRow(), replaceRandomSequenceInRows.getFirstSequence(),
          replaceRandomSequenceInRows.sequenceBoundariesInARow(rows.getSecondRow(), replaceRandomSequenceInRows.getSecondSequence()));
    }
    System.out.println("Previous rows: " + rows.getFirstRow() + " and " + rows.getSecondRow());
    System.out.println("New row is: " + changedRow);
  }
}
