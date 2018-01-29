import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.ExpectedExceptionsHolder;

public class TestLongDiv {
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
        return new Object[][]{{2, 3, 0},
               // {0, 0, 0},
                {2, - 2, - 1},
                {Long.MAX_VALUE, - 3, Long.MAX_VALUE / -3},
                {Long.MAX_VALUE, 3, Long.MAX_VALUE / 3},
               // {Long.MIN_VALUE, 0, 0 },
                {Long.MIN_VALUE, 1, Long.MIN_VALUE  / 1 },
               // {Long.MAX_VALUE, 0, 0 },
                {Long.MIN_VALUE, - 3, Long.MIN_VALUE / - 3},
                {Long.MIN_VALUE, Long.MAX_VALUE,   Long.MIN_VALUE / Long.MAX_VALUE},
                {-3, - 3, 1}};

    }

    @DataProvider(name="divByZero")
    public static Object[][] divByZero() {
        return new Object[][]{{0, 0},
                 {Long.MIN_VALUE, 0},
                 {Long.MAX_VALUE, 0}};

    }

    @Test(dataProvider = "divByZero", expectedExceptions = NumberFormatException.class)
    public void testDivNumbers(long dividend , long divider) {
        long result = calculator.div(dividend, divider);
    }

    @Test(dataProvider = "numbersData")
    public void testDivNumbersByZero(long firstFactor , long secondFactor, long composition) {
        Assert.assertEquals(composition, calculator.div(firstFactor, secondFactor));
    }

    @Test
    public void testSubStringNumbers() {
        Assert.assertEquals(0, calculator.div(Long.parseLong("1"), Long.parseLong("234")));

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
        Assert.assertEquals(- 234, calculator.div(firstSummandLong, Long.parseLong("1")));
    }

    @Test
    public void testSubHexadecimalNumbers() {
        String numberAsString = "ff";
        Assert.assertEquals(51, calculator.div( Long.valueOf(numberAsString, 16),5));

    }

    @Test
    public void testSubOctalNumbers() {
        String numberAsString = "377";
        Assert.assertEquals(51, calculator.div( Long.valueOf(numberAsString, 8),5));

    }

    @Test
    public void testSubBinaryNumbers() {
        String numberAsString = "111111111";
        Assert.assertEquals(102, calculator.div( Long.valueOf(numberAsString, 2),5));
    }
}
