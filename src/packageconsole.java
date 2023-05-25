import java.io.Console;

public class packageconsole {
    public static void main(String[] args) {
        Console con = System.console();
        System.out.println("Enter you fav color");
        String colour= con.readLine();
        System.out.println("favourite color is " + colour);
    }

}
