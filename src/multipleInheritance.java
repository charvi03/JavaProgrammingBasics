public class multipleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}
interface one {
    void print_geek();
}
interface two {
    void print_for();
}
interface three extends one, two {
    void print_geek();
}
class Child implements three {
    @Override
    public void print_geek() {
        System.out.println("Geeks");
    }
    public void print_for() {
        System.out.println("for");
    }
}

