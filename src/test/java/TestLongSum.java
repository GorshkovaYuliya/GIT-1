import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestLongSum {
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
        Assert.assertEquals(234566666, calculator.sum(5, 234566661));
    }

    @Test
    public void testIfSummarizePositiveAndNegativeNumbers() {
        Assert.assertEquals(0, calculator.sum(-1, 1));
    }

    @Test
    public void testIfSummarizeNegativeNumbers() {
        Assert.assertEquals(- 234566662, calculator.sum(- 1, - 234566661));
    }

    @Test
    public void testIfSummarizeNumbersBiggerThanUpperBound() {
       long result = calculator.sum(Long.MAX_VALUE, 1);
    }

    @Test
    public void testIfSummarizeNumbersLowerThanBottomBound() {
        long result = calculator.sum(Long.MIN_VALUE, - 1);
    }

    @Test
    public void testIfSummarizeNumbersOnTheUpperBoundary() {
        Assert.assertEquals(Long.MAX_VALUE, calculator.sum(Long.MAX_VALUE - 3,3));
    }

    @Test
    public void testIfSummarizeNumbersOnTheLowerBoundary() {
        Assert.assertEquals(Long.MIN_VALUE, calculator.sum(Long.MIN_VALUE + 3,- 3));
    }

    @Test
    public void testSummationStringNumbers() {
        Assert.assertEquals(235, calculator.sum(Long.parseLong("1"), Long.parseLong("234")));

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testSummationStringLetters() {
        long result = calculator.sum(Long.parseLong("q"), Long.parseLong("234wer"));
    }

    @Test
    public void testSummationStringNegativeNumbers() {
        String firstSummand = "-234";
        firstSummand = firstSummand.substring(1, firstSummand.length());
        Long firstSummandLong = -1 * Long.parseLong(firstSummand) ;
        Assert.assertEquals(- 233, calculator.sum(firstSummandLong, Long.parseLong("1")));
    }

    @Test
    public void testSummationHexadecimalNumbers() {
        String numberAsString = "ff";
        Assert.assertEquals(260, calculator.sum( Long.valueOf(numberAsString, 16),5));

    }

    @Test
    public void testSummationOctalNumbers() {
        String numberAsString = "377";
        Assert.assertEquals(260, calculator.sum( Long.valueOf(numberAsString, 8),5));

    }

    @Test
    public void testSummationBinaryNumbers() {
        String numberAsString = "111111111";
        Assert.assertEquals(516, calculator.sum( Long.valueOf(numberAsString, 2),5));
    }
}
