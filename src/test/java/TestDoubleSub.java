import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDoubleSub {
    Calculator calculator;
    @BeforeTest
    public void setUp() {
        calculator = new Calculator();
    }
    @AfterTest
    public void messageOfTheResult() {
        System.out.println("Tests are passed");
    }
    @DataProvider(name="numbersData")
    public static Object[][] getClient2Data() {
        return new Object[][]{{2.0, 3.0, -1.0},
                {0, 0, 0},
                {2.0, -2.0, .0},
                {2.22, -2.1, 2.23},
                {Double.MAX_VALUE, - 3.0, Double.MAX_VALUE + 3.0},
                {Double.MAX_VALUE, 3, Double.MAX_VALUE - 3},
                {Double.MIN_VALUE, 0, Double.MIN_VALUE },
                {Double.MIN_VALUE, 1, Double.MIN_VALUE  - 1 },
                {Double.MAX_VALUE, 0, Double.MAX_VALUE },
                {Double.MIN_VALUE, - 3, Double.MIN_VALUE + 3},
                {Double.MAX_VALUE, Double.MIN_VALUE,  Double.MAX_VALUE - Double.MIN_VALUE },
                { Double.MIN_VALUE,Double.MAX_VALUE, Double.MIN_VALUE - Double.MAX_VALUE   },
                {-3.0, - 3.0, 0.0}};

    }

    @Test(dataProvider = "numbersData")
    public void testSummationNumbers(Double minuend , Double subtrahend, Double difference) {
        Assert.assertEquals(difference, calculator.sub(minuend, subtrahend));
    }

    @Test
    public void testSubStringNumbers() {
        Assert.assertEquals(- 233, calculator.sub(Double.parseDouble("1"), Double.parseDouble("234")));

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testSubStringLetters() {
        double result = calculator.sub(Double.parseDouble("q"), Double.parseDouble("234wer"));
    }

}
