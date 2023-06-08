public class StringOutofbound {
    public static void main(String[] args) {
        try {
            String text = "Hello, World!";
            char character = text.charAt(20); // Accessing index 20, which is out of bounds
            System.out.println(character);
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}
