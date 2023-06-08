public class exceptionhandling {
    public static void main(String[] args) {
        try {
            int frac = 100 / 0;
        } catch (ArithmeticException err) {
            System.out.println("In the catch Block due to exception \n "
                    + err);
        }
        System.out.println("rest of the code...");
    }
}

