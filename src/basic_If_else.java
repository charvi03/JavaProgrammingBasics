import java.util.Scanner;

public class basic_If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF I");
        int i = sc.nextInt();
        if (i <= 17) {
            System.out.println("I is smaller");
        } else {
            System.out.println("I is bigger");
        }
    }
}
