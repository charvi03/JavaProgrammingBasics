import java.util.Scanner;

public class inches_to_metres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Inches value");
        int Inches = sc.nextInt();
        double meter = Inches * 0.0254;
        System.out.println(Inches + " in meters is " + meter);
    }
}
