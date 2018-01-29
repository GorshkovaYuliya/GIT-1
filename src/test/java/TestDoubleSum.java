import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestDoubleSum {
    Calculator calculator;
    @BeforeTest
    public void setUp() {
        calculator = new Calculator();
    }
    @AfterTest
    public void messageOfTheResult() {
        System.out.println("Tests are passed");
    }

    @Test
    public void testIfSummarizePositiveNumbers() {
        Assert.assertEquals(234.01, calculator.sum(0.01, 234));
    }

    @Test
    public void testIfSummarizePositiveAndNegativeNumbers() {
        Assert.assertEquals(- 1.123232, calculator.sum(- 1.1232323, 0.0000003));
    }

    @Test
    public void testIfSummarizeNegativeNumbers() {
        Assert.assertEquals(- 234566662.1, calculator.sum(- 1.1, - 234566661));
    }

    @Test
    public void testIfSummarizeNumbersBiggerThanUpperBound() {
        double result = calculator.sum(Double.MAX_VALUE, 0.00000001);
    }

    @Test
    public void testIfSummarizeNumbersLowerThanBottomBound() {
        double result = calculator.sum(Double.MIN_VALUE, - 0.00000001);
    }


    @Test
    public void testSummationStringNumbers() {
        Assert.assertEquals(235.0, calculator.sum(Double.parseDouble("1"), Double.parseDouble("234")));

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testSummationStringLetters() {
        double result = calculator.sum(Double.parseDouble("q"), Double.parseDouble("234wer"));
    }

    @Test
    public void testSummationStringNegativeNumbers() {
        String firstSummand = "-234.2";
        firstSummand = firstSummand.substring(1, firstSummand.length());
        double firstSummandDouble = -1 * Double.parseDouble(firstSummand) ;
        Assert.assertEquals(- 233.2, calculator.sum(firstSummandDouble, Double.parseDouble("1.0")));
    }

}
