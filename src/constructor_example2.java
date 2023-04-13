public class constructor_example2 {
    public static void main(String[] args) {
        Car obj = new Car(1986, "Mustang");
        System.out.println(obj.modelYear + " " + obj.modelName);

    }
}

class Car {
    int modelYear;
    String modelName;

    public Car(int year, String name) {
        modelYear = year;
        modelName = name;
    }
}
