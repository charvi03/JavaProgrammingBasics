import java.util.Scanner;

public class array_declaration {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last element");
        arr[4] = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("the array element " + i + " is " + arr[i]);
        }
    }
}
