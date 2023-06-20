import java.io.File;

public class displayFile {
    public static void main(String[] args) {
        String path = "E:\\MCA SEM 2\\filefolder";
        File fobj = new File(path);
        displayFile obj = new displayFile();
        if (fobj.exists() && fobj.isDirectory()) {
            File a[] = fobj.listFiles();
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = ");
            System.out.println("Displaying Files from the directory : " + fobj);
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = ");
            obj.printFileName(a, 0, 0);
        }
    }
    public void printFileName(File[] a, int i, int lvl) {
        if (i == a.length) {
            return;
        }
        if (a[i].isFile()) {
            System.out.println(a[i].getName());
        }
        printFileName(a, i + 1, lvl);
    }
}
