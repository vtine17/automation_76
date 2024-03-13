import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber() {
        MainClass number = new MainClass();

        int threshold = 45;
        int realValue = number.getClassNumber();

        Assert.assertTrue("Фактическое значение меньше либо равно " + threshold, realValue > threshold);
    }
}
