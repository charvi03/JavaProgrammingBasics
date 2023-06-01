public class constructor_example {
    public static void main(String[] args) {
        Dog1 tuffy = new Dog1("Tuffy", "papillon", 5, "white");
        System.out.println(tuffy);
        Dog1 misti = new Dog1("Mishthi", "labra", 7, "Brown");
        System.out.println(misti);

    }
}

class Dog1 {
    String name;
    String bread;
    int age;
    String color;

    public Dog1(String name, String bread, int age, String color) {
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
