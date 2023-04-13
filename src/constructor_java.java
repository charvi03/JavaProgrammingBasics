public class constructor_java {
    int x;

    public constructor_java(int y) {
        x = y;
    }

    public static void main(String[] args) {
        constructor_java obj = new constructor_java(5);
        System.out.println(obj.x);

    }
}
