import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestIsPositiveFunction {
    Calculator calculator;
    @BeforeTest
    public void setUp() {
        calculator = new Calculator();
    }
    @AfterTest
    public void messageOfTheResult() {
        System.out.println("Tests are passed");
    }

    @DataProvider(name="positiveResult")
    public static Object[][] getDataPositive() {
        return new Object[][]{
                {1},
                {23232323},
                {Long.MAX_VALUE},
                {3343}};

    }

    @DataProvider(name="negativeResult")
    public static Object[][] getDataNegative() {
        return new Object[][]{
                {-1},
                {-23232323},
                {Long.MIN_VALUE},
                {-3343}};

    }

    @Test(dataProvider = "positiveResult")
    public void testIsPositiveNumbers(long firstFactor ) {
        Assert.assertTrue( calculator.isPositive(firstFactor));
    }
    @Test(dataProvider = "negativeResult")
    public void testisNegativeNumbers(long firstFactor ) {
        Assert.assertFalse( calculator.isPositive(firstFactor));
    }
    


}
