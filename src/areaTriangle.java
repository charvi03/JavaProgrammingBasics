import java.util.Scanner;

public class areaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, height;
        System.out.println("Enter the base");
        base = sc.nextInt();
        System.out.println("Enter the height");
        height = sc.nextInt();
        int area = (base * height) / 2;
        System.out.println("Area of triangle is :" + area);
    }
}
