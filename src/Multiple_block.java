public class Multiple_block {
    public static void main(String[] args) {
        try {
            int result = dividenumbers(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Exception occured " + e.getMessage());
        }
    }

    public static int dividenumbers(int div, int divisor) {
        return div / divisor;
    }
}
