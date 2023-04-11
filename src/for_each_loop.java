public class for_each_loop {
    public static void main(String[] args) {
        String[] names = {"Java", "C", "C++", "Python", "Javascript"};
        System.out.println("Printing content of array names");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
