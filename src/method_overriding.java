public class method_overriding {
    public static void main(String[] args) {
        Dogg d1 = new Dogg();
        Animl a1 = new Animl();
        d1.eat();
        a1.eat();
        Animl animl = new Dogg();
        animl.eat();
    }
}
class Animl {
    void eat() {
        System.out.println("eat() method of base class");
        System.out.println("eating.");
    }
}
class Dogg extends Animl {
    void eat() {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }
}
