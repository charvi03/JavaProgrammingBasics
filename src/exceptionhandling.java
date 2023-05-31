public class exceptionhandling {
    public static void main(String[] args) {
        int d = 0;
        int n = 20;
        try {
            int frac = n / d;
        } catch (ArithmeticException err) {
            System.out.println("In the catch Block due to exception " + err);
        }
        System.out.println("End of main");
    }
}
