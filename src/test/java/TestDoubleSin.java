import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;
public class TestDoubleSin {
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
                    {Math.PI/6,Math.sin(Math.PI/6)},
                    {Math.PI/4,Math.sin(Math.PI/4)},
                    {Math.PI/3,Math.sin(Math.PI/3)},
                    {Math.PI/2,Math.sin(Math.PI/2) },
                    {Math.PI,Math.sin(Math.PI)},
                    {Math.PI * 3/2,Math.sin(Math.PI *3/2)},
                    {Math.PI * 2,Math.sin(Math.PI * 2)},
                    {Double.MIN_VALUE * Math.PI / 180, Math.sin(Double.MIN_VALUE * Math.PI / 180)},
                    {Double.MAX_VALUE * Math.PI /180, Math.sin(Double.MAX_VALUE * Math.PI/180)}};

        }

        @Test(dataProvider = "numbersData")
        public void testSummationNumbers(double firstFactor,double  result) {
            Assert.assertEquals(result, calculator.sin(firstFactor));
        }

        @Test
        public void testSubStringNumbers() {
            Assert.assertEquals(0.0, calculator.sin(Double.parseDouble("0")));

        }

        @Test(expectedExceptions = NumberFormatException.class)
        public void testSubStringLetters() {
            double result = calculator.sin( Double.parseDouble("234wer"));
        }

        @Test
        public void testSubStringNegativeNumbers() {
            String firstSummand = "-1.5707963267949";
            firstSummand = firstSummand.substring(1, firstSummand.length());
            double firstSummandDouble = -1 * Double.parseDouble(firstSummand) ;
            Assert.assertEquals(- 1.0, calculator.sin(firstSummandDouble));
        }

    }


