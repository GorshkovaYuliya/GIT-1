import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestLongSum {
    Calculator calculator = new Calculator();
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

    @Test(expectedExceptions = NumberFormatException.class)
    public void testIfSummarizeNumbersBiggerThanUpperBound() {
       long result = calculator.sum(Long.MAX_VALUE, 1);
    }

    @Test(expectedExceptions = NumberFormatException.class)
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




}
