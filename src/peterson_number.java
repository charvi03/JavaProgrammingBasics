import java.util.Scanner;

public class peterson_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        if (PetersonNumber.isPetersonNumber(n)) {
            System.out.println(n + " is a Peterson number");
        } else {
            System.out.println(n + " is not a Peterson number");
        }
    }

    public class PetersonNumber {

        private static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }

        public static boolean isPetersonNumber(int n) {
            int sum = 0;
            int temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }
            return sum == n;
        }

    }
}
