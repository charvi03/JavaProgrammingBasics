public class constructor_example3 {
    public static void main(String[] args) {
        Bird b = new Bird("yellow", "no", 3, "Java sparrow");
        System.out.println("The bird name is " + b.BirdName);
        System.out.println("The age is " + b.age);
        System.out.println("The color is " + b.color);
        System.out.println("Does it fly? " + b.flies);
    }
}

class Bird {
    String color;
    String flies;
    int age;
    String BirdName;

    public Bird(String color, String fly, int age, String name) {
        this.color = color;
        this.flies = fly;
        this.age = age;
        this.BirdName = name;
    }
}
