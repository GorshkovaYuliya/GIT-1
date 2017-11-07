import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * This program creates N arrays of BigDecimal numbers,
 * then forms an array that includes elements that are located at least in two arrays
 */
public class AnArrayConsistingOfIdenticalElementsOfOtherArrays {

  /**
   * This function fill single array with BigDecimal values.
   * @param lengthOfArray length of a single array.
   * @return filled single array.
   */
  public  ArrayList<BigDecimal> fillArray (int lengthOfArray) {
    ArrayList<BigDecimal> array = new ArrayList<BigDecimal>(Collections.nCopies(lengthOfArray, BigDecimal.ZERO));
    for (int i = 0; i < array.size(); i++){
      array.set(i,generateRandomNumber());
    }
    return array;
  }

  /**
   * This function generate a random number.
   * @return generated BigDecimal random value
   */
  public BigDecimal generateRandomNumber() {
    Random random = new Random();
    double currentNumber =0;
    currentNumber = random.nextDouble();
    BigDecimal randomNumber = new BigDecimal(0);
    randomNumber = BigDecimal.valueOf(currentNumber);
    BigDecimal rounded = randomNumber.round(new MathContext(2, RoundingMode.HALF_UP));
    return rounded;
  }

  /**
   * This function makes two-dimensional array.
   * @param amount number of lines.
   * @param length line length.
   * @return two-dimensional array.
   */
  public ArrayList<ArrayList<BigDecimal>> makeTwoDimensionalArray(int amount, int length){
    ArrayList<ArrayList<BigDecimal>> sourceArray = new ArrayList<>();
    for(int i = 0; i < amount; i++) {
      sourceArray.get(i).addAll(fillArray(length));
    }
    return sourceArray;
  }

  /**
   * This function sort ascending a single array.
   * @param values a single array.
   * @param length length of a single array.
   * @return sorted array.
   */
  public ArrayList<BigDecimal> sortSourceArrays(ArrayList<BigDecimal> values, int length) {
    for (int i = 0; i < length; i++) {
      Collections.sort(values);
    }
    return values;
  }

  /**
   * This function delete equal elements of a single line.
   * @param values a single array.
   * @param length length of a single array.
   * @return array without equal elements.
   */
  public ArrayList<BigDecimal> deleteEqualElementsOfASingleLine(ArrayList<BigDecimal> values,int length) {
    BigDecimal buffer ;
    for(int i = 0; i < values.size(); i++) {
      buffer = values.get(i);
      for(int j = 1; j < values.size() - 1; j++) {
        if(values.get(j).compareTo(buffer) == 0) {
          values.remove(j);
        }
      }
    }
    return values;
  }

  /**
   * This function concatenate all lines in a single array.
   * @param values a single line of array.
   * @return concatenated array.
   */
  public ArrayList<BigDecimal> concatenateAllLinesInASingleLine(ArrayList<BigDecimal> values) {
    ArrayList<BigDecimal> combinedArray = new ArrayList<>((Collections.nCopies(0, BigDecimal.ZERO)));
    combinedArray.addAll(values);
    return combinedArray;
  }

  /**
   * This function forms an array that includes elements that are located at least in two arrays.
   * @param values formed single array.
   * @return formed array.
   */
  public ArrayList<BigDecimal> formArray(ArrayList<BigDecimal> values) {
    BigDecimal buffer;
    for (int i = 0; i < values.size(); i++) {
      buffer = values.get(i);
      for (int j = 1; j < values.size() - 1; j++) {
        if(values.get(j).compareTo(buffer) != 0) {
          values.remove(j);
        }
      }
    }
    return values;
  }
}
