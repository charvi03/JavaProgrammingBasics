import java.io.*;

public class append_file {
    public static void main(String[] args) {
        String fileName = "file1.txt";
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(fileName));
            out.write("Hello world:\n");
            out.close();
        } catch (IOException e) {
            System.out.println("Exception occured " + e);
        }
        String str = "This is my world";
        appendToFile(fileName, str);
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader("file1.txt"));
            String mystring;
            while ((mystring = in.readLine()) != null) {
                System.out.println(mystring);
            }
        } catch (IOException e) {
            System.out.println("Exception occured " + e);
        }
    }

    public static void appendToFile(String filename, String str) {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(filename, true));
            out.write(str);

            out.close();
        } catch (IOException e) {
            System.out.println("exception occured" + e);
        }
    }
}
