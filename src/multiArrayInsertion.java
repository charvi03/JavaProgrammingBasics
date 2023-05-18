public class multiArrayInsertion {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int element = 10;
        int row = 1;
        int column = 2;

        // Check if the specified position is valid
        if (row < 0 || row >= array.length || column < 0 || column >= array[row].length) {
            System.out.println("Invalid position.");
            return;
        }

        // Create a new 2D array with increased size
        int[][] newArray = new int[array.length][array[row].length + 1];

        // Copy the elements from the original array to the new array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == row && j >= column) {
                    // Shift the elements to the right of the insertion position
                    newArray[i][j + 1] = array[i][j];
                } else {
                    newArray[i][j] = array[i][j];
                }
            }
        }

        // Insert the new element at the specified position
        newArray[row][column] = element;

        // Print the updated array
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}