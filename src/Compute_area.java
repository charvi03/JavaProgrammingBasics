import java.util.Scanner;

public class Compute_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r;
        System.out.println("Enter the radius");
        r = sc.nextFloat();
        float area = (float) (3.14 * r * r);
        System.out.println("Area of circle is :" + area);
        int l, b;
        System.out.println("Enter the length");
        l = sc.nextInt();
        System.out.println("Enter the breadth");
        b = sc.nextInt();
        int area1 = l * b;
        System.out.println("Area of rectangle is :" + area1);
        int base, height;
        System.out.println("Enter the base");
        base = sc.nextInt();
        System.out.println("Enter the height");
        height = sc.nextInt();
        int area2 = (base * height) / 2;
        System.out.println("Area of triangle is :" + area2);
        int side;
        System.out.println("Enter the side");
        side = sc.nextInt();
        int area3 = side * side;
        System.out.println("Area of square is :" + area3);

    }
}
