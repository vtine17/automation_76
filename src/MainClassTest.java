import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass Number = new MainClass();

        int expectedValue = 14;
        int realValue = Number.getLocalNumber();

        Assert.assertTrue("Фактическое значение не равно ожидаемому: " + expectedValue, realValue == expectedValue);
    }
}
