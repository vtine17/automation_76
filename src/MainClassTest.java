import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassString() {
        MainClass strValue = new MainClass();

        String realValue = strValue.getClassString();

        System.out.println(realValue);

        int indexWordFirst = realValue.indexOf("Hello");
        int indexWordSecond = realValue.indexOf("hello");

        Assert.assertTrue("В строке нет слов Hello или hello",
                (indexWordFirst >= 0)||(indexWordSecond >= 0));
    }
}
