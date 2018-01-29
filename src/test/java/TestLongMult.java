import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLongMult {
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
        return new Object[][]{{2, 3, 6},
                {0, 0, 0},
                {2, - 2, - 4},
                {Long.MAX_VALUE, - 3, Long.MAX_VALUE *-3},
                {Long.MAX_VALUE, 3, Long.MAX_VALUE *3},
                {Long.MIN_VALUE, 0, 0 },
                {Long.MIN_VALUE, 1, Long.MIN_VALUE  * 1 },
                {Long.MAX_VALUE, 0, 0 },
                {Long.MIN_VALUE, - 3, Long.MIN_VALUE * - 3},
                {Long.MIN_VALUE, Long.MAX_VALUE, Long.MAX_VALUE * Long.MIN_VALUE},
                {-3, - 3, 9}};

    }

    @Test(dataProvider = "numbersData")
    public void testSummationNumbers(long firstFactor , long secondFactor, long composition) {
        Assert.assertEquals(composition, calculator.mult(firstFactor, secondFactor));
    }

    @Test
    public void testSubStringNumbers() {
        Assert.assertEquals(234, calculator.mult(Long.parseLong("1"), Long.parseLong("234")));

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testSubStringLetters() {
        long result = calculator.mult(Long.parseLong("q"), Long.parseLong("234wer"));
    }

    @Test
    public void testSubStringNegativeNumbers() {
        String firstSummand = "-234";
        firstSummand = firstSummand.substring(1, firstSummand.length());
        Long firstSummandLong = -1 * Long.parseLong(firstSummand) ;
        Assert.assertEquals(- 234, calculator.mult(firstSummandLong, Long.parseLong("1")));
    }

    @Test
    public void testSubHexadecimalNumbers() {
        String numberAsString = "ff";
        Assert.assertEquals(1275, calculator.mult( Long.valueOf(numberAsString, 16),5));

    }

    @Test
    public void testSubOctalNumbers() {
        String numberAsString = "377";
        Assert.assertEquals(1275, calculator.mult( Long.valueOf(numberAsString, 8),5));

    }

    @Test
    public void testSubBinaryNumbers() {
        String numberAsString = "111111111";
        Assert.assertEquals(2555, calculator.mult( Long.valueOf(numberAsString, 2),5));
    }
}
