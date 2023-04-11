import java.util.Scanner;

public class largest_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF a");
        int a = sc.nextInt();
        System.out.println("ENTER THE VALUE OF b");
        int b = sc.nextInt();
        System.out.println("ENTER THE VALUE OF c");
        int c = sc.nextInt();

        if ((a >= b) && (a >= c)) {
            System.out.println("A is largest");
        } else if (b >= c) {
            System.out.println("B is largest");

        } else {
            System.out.println("C is largest");
        }
    }
}
