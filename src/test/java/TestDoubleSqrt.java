import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDoubleSqrt {
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
        return new Object[][]{{Double.MAX_VALUE,Math.sqrt(Double.MAX_VALUE)},
                {Double.MIN_VALUE, Math.sqrt(Double.MIN_VALUE) },
                {-2.0,Math.sqrt( - 2.0)},
                {0,Math.sqrt(0)},
                {1 ,Math.sqrt(1)},
                {0.0000001,Math.sqrt(0.0000001)},
                {-0.111111,Math.sqrt(-1.111111)}};

    }


    @Test(dataProvider = "numbersData")
    public void testSummationNumbers(double firstFactor ,double result) {
        Assert.assertEquals(result, calculator.sqrt(firstFactor));
    }

    @Test
    public void testSubStringNumbers() {
        Assert.assertEquals(1.0, calculator.sqrt(Double.parseDouble("1")));

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testSubStringLetters() {
        double result = calculator.sqrt( Double.parseDouble("234wer"));
    }

    @Test
    public void testSubStringNegativeNumbers() {
        String firstSummand = "-23";
        firstSummand = firstSummand.substring(1, firstSummand.length());
        double firstSummandDouble = -1 * Double.parseDouble(firstSummand) ;
        Assert.assertEquals(Math.sqrt(-23), calculator.sqrt(firstSummandDouble));
    }

}


