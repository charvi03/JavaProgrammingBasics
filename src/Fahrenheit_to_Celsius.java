import java.util.Scanner;

public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature");
        double Fahrenheit = sc.nextDouble();
        double Celsius = (Fahrenheit - 32) / 1.8;
        System.out.println("The temperature in Celsius is " + Celsius);
    }
}
