import java.util.Scanner;

public class constructor_example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of bird");
        String n = sc.nextLine();
        System.out.println("Enter the age");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the color");
        String c = sc.nextLine();
        Bird b = new Bird(c, a, n);
        System.out.println("The bird name is " + b.BirdName);
        System.out.println("The age is " + b.age);
        System.out.println("The color is " + b.color);

    }
}

class Bird {
    String color;
    /*String flies;*/
    int age;
    String BirdName;

    public Bird(String color, int age, String name) {
        this.color = color;
        /* this.flies = fly;*/
        this.age = age;
        this.BirdName = name;
    }
}
