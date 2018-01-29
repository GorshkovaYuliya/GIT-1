import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDoubleMult {
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
    public static Object[][] getNumbersData() {
        return new Object[][]{{2.0, 3.0, 6.0},
                {0.0, 0.0, 0.0},
                {2.0, - 2.0, - 4.0},
                {Double.MAX_VALUE, - 3, Double.MAX_VALUE *-3},
                {Double.MAX_VALUE, 3, Double.MAX_VALUE *3},
                {Double.MIN_VALUE, 0, 0 },
                {Double.MIN_VALUE, 1.0, Double.MIN_VALUE  * 1.0 },
                {Double.MAX_VALUE, 0.0, 0.0 },
                {0.0, - 3.123123123, 0.0},
                {Double.MIN_VALUE, - 3.0, Double.MIN_VALUE * - 3.0},
                {Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE * Double.MIN_VALUE},
                {-3.0, - 3.0, 9.0}};

    }

    @Test(dataProvider = "numbersData")
    public void testSummationNumbers(double firstFactor , double secondFactor, double composition) {
        Assert.assertEquals(composition, calculator.mult(firstFactor, secondFactor));
    }

    @Test
    public void testSubStringNumbers() {
        Assert.assertEquals(234.0, calculator.mult(Double.parseDouble("1"), Double.parseDouble("234")));

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testSubStringLetters() {
        double result = calculator.mult(Double.parseDouble("q"), Double.parseDouble("234wer"));
    }

    @Test
    public void testSubStringNegativeNumbers() {
        String firstSummand = "-234";
        firstSummand = firstSummand.substring(1, firstSummand.length());
        double firstSummandDouble = -1 * Double.parseDouble(firstSummand) ;
        Assert.assertEquals(- 234.0, calculator.mult(firstSummandDouble, Double.parseDouble("1")));
    }

}
