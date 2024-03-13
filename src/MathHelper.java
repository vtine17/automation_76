public class MathHelper {
    public int giveMeInt() {
        return 88;
    }

    public int calc(int a, int b, char action) {
        if (action == '+') {
            return this.plus(a, b);
        } else if (action == '-') {
            return this.minus(a, b);
        } else if (action == '*') {
            return this.multy(a, b);
        } else if (action == '/') {
            return this.divide(a, b);
        } else {
            return this.typeAnError("Wrong action: " + action);
        }

    }

    public int multiply(int number) {
        return number * 2;
    }

    public int multiply(int number, int mutliplier) {
        return number * mutliplier;
    }

    private int plus(int a, int b) {
        return a + b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int multy(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        if (b == 0) {
            return this.typeAnError("Cannot divide by zero");
        } else {
            return a / b;
        }
    }

    private int typeAnError(String error_message) {
        System.out.println(error_message);
        return 0;
    }
}
