import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestLongSub {
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
        return new Object[][]{{2, 3, -1},
                {0, 0, 0},
                {2, -2, 4},
                {Long.MAX_VALUE, - 3, Long.MAX_VALUE + 3},
                {Long.MAX_VALUE, 3, Long.MAX_VALUE - 3},
                {Long.MIN_VALUE, 0, Long.MIN_VALUE },
                {Long.MIN_VALUE, 1, Long.MIN_VALUE  - 1 },
                {Long.MAX_VALUE, 0, Long.MAX_VALUE },
                {Long.MIN_VALUE, - 3, Long.MIN_VALUE + 3},
                {Long.MIN_VALUE, Long.MAX_VALUE, Long.MAX_VALUE - Long.MIN_VALUE},
                {Long.MAX_VALUE,Long.MIN_VALUE, Long.MIN_VALUE  - Long.MAX_VALUE},
                {-3, - 3, 0}};

    }

    @Test(dataProvider = "numbersData")
    public void testSummationNumbers(long minuend , long subtrahend, long difference) {
        Assert.assertEquals(difference, calculator.sub(minuend, subtrahend));
    }

  @Test
    public void testSubStringNumbers() {
        Assert.assertEquals(- 233, calculator.sub(Long.parseLong("1"), Long.parseLong("234")));

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testSubStringLetters() {
        long result = calculator.sub(Long.parseLong("q"), Long.parseLong("234wer"));
    }

    @Test
    public void testSubStringNegativeNumbers() {
        String firstSummand = "-234";
        firstSummand = firstSummand.substring(1, firstSummand.length());
        Long firstSummandLong = -1 * Long.parseLong(firstSummand) ;
        Assert.assertEquals(- 235, calculator.sub(firstSummandLong, Long.parseLong("1")));
    }

    @Test
    public void testSubHexadecimalNumbers() {
        String numberAsString = "ff";
        Assert.assertEquals(250, calculator.sub( Long.valueOf(numberAsString, 16),5));

    }

    @Test
    public void testSubOctalNumbers() {
        String numberAsString = "377";
        Assert.assertEquals(250, calculator.sub( Long.valueOf(numberAsString, 8),5));

    }

    @Test
    public void testSubBinaryNumbers() {
        String numberAsString = "111111111";
        Assert.assertEquals(506, calculator.sub( Long.valueOf(numberAsString, 2),5));
    }
}