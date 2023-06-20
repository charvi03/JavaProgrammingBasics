import java.io.File;

public class fileExist {
    public static void main(String[] args) {
        File myfiledir = new File("E:\\MCA SEM 2\\filefolder\\hello.txt");
        if (myfiledir.exists()) {
            System.out.println("The directory or file exists.\n");
        } else {
            System.out.println("The directory or file does not exist.\n");
        }
    }
}
