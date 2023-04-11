import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b;
        System.out.println("Enter the length");
        l = sc.nextInt();
        System.out.println("Enter the breadth");
        b = sc.nextInt();
        int area = l * b;
        System.out.println("Area of rectangle is :" + area);
    }
}

