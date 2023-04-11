import java.util.Scanner;

public class min_to_years_and_Dates {
    public static void main(String[] args) {
        double minutesInYear = 60 * 24 * 365;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = sc.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately "
                + years + " years and " + days + " days");
    }
}



