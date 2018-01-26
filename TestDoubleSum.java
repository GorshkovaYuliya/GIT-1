import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestDoubleSum {
    Calculator calculator = new Calculator();

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

    @Test(expectedExceptions = NumberFormatException.class)
    public void testIfSummarizeNumbersBiggerThanUpperBound() {
        double result = calculator.sum(Double.MAX_VALUE, 0.00000001);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testIfSummarizeNumbersLowerThanBottomBound() {
        double result = calculator.sum(Double.MIN_VALUE, - 0.00000001);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testIfSummarizeNumbersLowerThanBottomBound() {
        long result = calculator.sum(Long.MIN_VALUE, - 1);
    }
}
