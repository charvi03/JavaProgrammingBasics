public class Nested_tryCatch {
    public static void main(String[] args) {
        try {
// Outer try block
            int[] numbers = {1, 2, 3};
            int result = numbers[5]; // This will throw an ArrayIndexOutOfBoundsException
            try {
// Inner try block
                int division = 10 / 0; // This will throw an ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch block: " + e.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch block: " + e.getMessage());
        }

    }
}
