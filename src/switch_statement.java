import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n = sc.nextInt();

        int c;
        if (n > 0) {
            c = 1;
        } else if (n < 0) {
            c = 2;
        } else {
            c = 3;
        }

        switch (c) {
            case 1:
                System.out.print("Positive Number");
                break;

            case 2:
                System.out.print("Negative Number");
                break;

            case 3:
                System.out.print("Zero");
                break;
            default:
                System.out.println("incorrect input");


        }
    }
}
