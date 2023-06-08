public class unchecked_throw {
    public static void main(String[] args) {
        divideNumbers(10, 0);

    }

    public static void divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        int result = dividend / divisor;
        System.out.println("Result: " + result);
    }
}


