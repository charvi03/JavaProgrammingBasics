import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r;
        System.out.println("Enter the radius");
        r = sc.nextFloat();
        float area = (float) (3.14 * r * r);
        System.out.println("Area of circle is :" + area);
    }
}

