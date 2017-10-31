import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;
/**
 * This test class check if program continue run if
 * user enter negative answer on continuation request
 */
public class ConsoleReaderTest {
  ConsoleReader reader = new ConsoleReader();
  String negativeAnswer = "No";

  @Test
  public void checkIsContinueEntering() {
    assertFalse(reader.isContinueEntering(negativeAnswer));
  }
}