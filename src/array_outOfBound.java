public class array_outOfBound {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 3;
            int value = numbers[index];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception Occurred!");
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
