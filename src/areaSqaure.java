import java.util.Scanner;

public class areaSqaure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side;
        System.out.println("Enter the side");
        side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of square is :" + area);
    }
}

