import java.util.Scanner;

public class lcm_2_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int x = sc.nextInt();
        System.out.print("Enter the second number:");
        int y = sc.nextInt();
        int lcm = Math.max(x, y);
        while (true) {
            if (lcm % x == 0 && lcm % y == 0) {
                System.out.print("The LCM of " + x + " and " + y + " is: " + lcm);
                break;
            }
        }

    }
}
