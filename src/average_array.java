import java.util.Scanner;

public class average_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        double sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double avg = sum / 2;
        System.out.println("Average of all the elements of an array: " + avg);
    }
}
