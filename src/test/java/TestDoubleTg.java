import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDoubleTg {
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
        return new Object[][]{{0.0,Math.sin(0.0)},
                {Math.PI/6,Math.tan(Math.PI/6)},
                {Math.PI/4,Math.tan(Math.PI/4)},
                {Math.PI/3,Math.tan(Math.PI/3)},
                {Math.PI/2,Math.tan(Math.PI/2) },
                {Math.PI,Math.tan(Math.PI)},
                {Math.PI * 3/2,Math.tan(Math.PI *3/2)},
                {Math.PI * 2,Math.tan(Math.PI * 2)},
                {Double.MIN_VALUE * Math.PI / 180, Math.tan(Double.MIN_VALUE * Math.PI / 180)},
                {Double.MAX_VALUE * Math.PI /180, Math.tan(Double.MAX_VALUE * Math.PI/180)}};

    }

    @Test(dataProvider = "numbersData")
    public void testSummationNumbers(double firstFactor,double  result) {
        Assert.assertEquals(result, calculator.tg(firstFactor));
    }

    @Test
    public void testSubStringNumbers() {
        Assert.assertEquals(0.0, calculator.tg(Double.parseDouble("0")));

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testSubStringLetters() {
        double result = calculator.tg( Double.parseDouble("234wer"));
    }

    @Test
    public void testSubStringNegativeNumbers() {
        String firstSummand = "-3,1415926535";
        firstSummand = firstSummand.substring(1, firstSummand.length());
        double firstSummandDouble = -1 * Double.parseDouble(firstSummand) ;
        Assert.assertEquals(0, calculator.tg(firstSummandDouble));
    }
}
