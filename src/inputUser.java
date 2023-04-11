import java.util.Scanner;

public class inputUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum, mul, div, mod, sub;
        System.out.println("Enter the First number");
        x = sc.nextInt();
        System.out.println("Enter the Second number");
        y = sc.nextInt();
        sum = x + y;
        sub = x - y;
        mul = x * y;
        div = x / y;
        mod = x % y;
        System.out.println("The sum is : " + sum);
        System.out.println("The subtraction is : " + sub);
        System.out.println("The multiplication is : " + mul);
        System.out.println("The division is : " + div);
        System.out.println("The modulus is : " + mod);
    }
}
