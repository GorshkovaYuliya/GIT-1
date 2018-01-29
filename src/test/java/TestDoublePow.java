import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDoublePow {
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
        return new Object[][]{{2.0, 3.0, 8},
                {2.0, - 2.0, 0.25},
                {Double.MAX_VALUE, - 3,Math.pow(Double.MAX_VALUE ,-3.0)},
                {Double.MAX_VALUE, 3.0, Math.pow(Double.MAX_VALUE ,3.0)},
                {Double.MIN_VALUE, 1.0, Math.pow(Double.MIN_VALUE , 1.0) },
                {Double.MIN_VALUE, - 3.0,Math.pow( Double.MIN_VALUE ,- 3.0)},
                {Double.MIN_VALUE, Double.MAX_VALUE, Math.pow(Double.MIN_VALUE, Double.MAX_VALUE)},
                {-2.0, - 2.0, 0.25},
                {-2.0, 3.0, -8},
                {0,0, 1},
                {0,1, 0},
                {1,0, 1},
                {1,1, 1},
                {1,- 1, -1},
                {-1,1, -1},
                {1,234324, 1},
                {1,-2343, -1},
                {Double.MIN_VALUE, 0.0,1.0 },
                {Double.MAX_VALUE, 0.0,1.0}};

    }


    @Test(dataProvider = "numbersData")
    public void testSummationNumbers(double firstFactor , double secondFactor, double composition) {
        Assert.assertEquals(composition, calculator.pow(firstFactor, secondFactor));
    }

    @Test
    public void testSubStringNumbers() {
        Assert.assertEquals(1.0, calculator.pow(Double.parseDouble("1"), Double.parseDouble("234")));

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testSubStringLetters() {
        double result = calculator.pow(Double.parseDouble("q"), Double.parseDouble("234wer"));
    }

    @Test
    public void testSubStringNegativeNumbers() {
        String firstSummand = "-23";
        firstSummand = firstSummand.substring(1, firstSummand.length());
        double firstSummandDouble = -1 * Double.parseDouble(firstSummand) ;
        Assert.assertEquals(- 23.0, calculator.pow(firstSummandDouble, Double.parseDouble("1")));
    }

}
