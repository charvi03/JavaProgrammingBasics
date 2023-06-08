import java.util.Scanner;

public class smallest_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF a");
        int a = sc.nextInt();
        System.out.println("ENTER THE VALUE OF b");
        int b = sc.nextInt();
        System.out.println("ENTER THE VALUE OF c");
        int c = sc.nextInt();
        if (a <= b && a <= c)
            System.out.println(a + " is the smallest number");
        else if (b <= a && b <= c)
            System.out.println(b + " is the smallest number");
        else
            System.out.println(c + " is the smallest number");
    }
}
