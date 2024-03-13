import org.junit.Test;

public class MainTest extends CoreTestCase {

    int a = 5;
    int b = 10;

    public void typeStartMessage() {
        super.typeStartMessage();
        System.out.println("Current class is MainTest");
    }

    @Test
    public void myFirstTest(){
        this.typeStartMessage();
        this.typeString();
    }

    public void typeString() {
        MathHelper Math = new MathHelper();

        System.out.println("Hello from typeString");
        int a = Math.giveMeInt();
        int b = Math.multiply(7);
        int c = Math.multiply(2,85);

        System.out.println(a + ", " + b + ", " + c);
    }

    @Test
    public void mySecondTest() {
        this.typeStartMessage();
    }
}
