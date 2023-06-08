public class array_outOfBound {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 3;  // accessing index 3, which is out of bounds
            int value = numbers[index];  // This line will throw ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value);  // This line will not be executed
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception Occurred!");
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
