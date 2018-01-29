import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDoubleDiv {
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
        return new Object[][]{{9, 3.0},
                {0, 0},
                {1, 1},
                {Double.MAX_VALUE, 3.0},
                {Double.MIN_VALUE,},
                {-4, 2},
                {-33434343.0, 3}};


    }

    @Test(dataProvider = "numbersData")
    public void testSummationNumbers(double firstFactor , double result) {
        Assert.assertEquals(result, calculator.sqrt(firstFactor));
    }

    @Test
    public void testSubStringNumbers() {
        Assert.assertEquals(0.004273504273504274, calculator.sqrt(Double.parseDouble("1")));

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testSubStringLetters() {
        double result = calculator.sqrt(Double.parseDouble("q"));
    }

    @Test
    public void testSubStringNegativeNumbers() {
        String firstSummand = "-234";
        firstSummand = firstSummand.substring(1, firstSummand.length());
        double firstSummandDouble = -1 * Double.parseDouble(firstSummand) ;
        Assert.assertEquals(- 234.0, calculator.sqrt(firstSummandDouble));
    }

}

