public class super_constructor {
    public static void main(String[] args) {
        Students s = new Students();

    }
}

class Person {
    Person() {
        System.out.println("Person class Constructor");
    }
}

class Students extends Person {
    Students() {
        super();
        System.out.println("Student class Constructor");
    }
}
