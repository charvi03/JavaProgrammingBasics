import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            File f1 = new File("output.txt");
            Scanner data = new Scanner(f1);
            while ((data.hasNextLine())) {
                String filedata = data.nextLine();
                System.out.println(filedata);
            }
            data.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Unexpected error occured");
            exception.printStackTrace();
        }
    }
}
