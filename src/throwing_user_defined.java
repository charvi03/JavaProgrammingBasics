import java.util.Scanner;

public class throwing_user_defined {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = s.nextInt();
        try {
            if (age < 18) {
                throw new YoungerAgeException("you are not eligible for voting ");
            } else {
                System.out.println("you can vote");
            }
        } catch (YoungerAgeException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}

class YoungerAgeException extends RuntimeException {
    //creating a constructor
    YoungerAgeException(String msg) {
        super(msg);
    }
}
