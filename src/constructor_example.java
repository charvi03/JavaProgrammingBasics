public class constructor_example {
    public static void main(String[] args) {
        Dog tuffy = new Dog("Tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
        Dog misti = new Dog("Mishthi", "labra", 7, "Brown");
        System.out.println(misti.toString());

    }
}

class Dog {
    String name;
    String bread;
    int age;
    String color;

    public Dog(String name, String bread, int age, String color) {
        this.name = name;
        this.bread = bread;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return ("Hi my name is " + this.getName() + "\nMy bread,age and color are " + this.getBread() + "," +
                this.getAge() + "," + this.getColor());
    }
}
