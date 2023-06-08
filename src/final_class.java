public class final_class {
    public static void main(String[] args) {
        Honda1 honda = new Honda1();
        honda.run();
    }
}

//final
class Bikee {
}
class Honda1 extends Bikee {
    void run() {
        System.out.println("running safely with 100kmph");
    }
}


