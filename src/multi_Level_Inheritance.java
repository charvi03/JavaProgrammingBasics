public class multi_Level_Inheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}

class Animals {
    void eat() {
        System.out.println("eating...");
    }
}

class Doggy extends Animals {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Doggy {
    void weep() {
        System.out.println("weeping...");
    }
}
