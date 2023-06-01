public class ArrayOfObjects {
    public static void main(String[] args) {
        Products[] obj = new Products[5];
        obj[0] = new Products(2011, "dell laptop");
        obj[1] = new Products(1555, "Hp laptop");
        obj[2] = new Products(3333, "kingston USB");
        obj[3] = new Products(2001, "dell mouse");
        obj[4] = new Products(1975, " Zebronics mouse");
        System.out.println("Product object 1: ");
        obj[0].display();
        System.out.println("Product object 2: ");
        obj[1].display();
        System.out.println("Product object 3: ");
        obj[2].display();
        System.out.println("Product object 4: ");
        obj[3].display();
        System.out.println("Product object 5: ");
        obj[4].display();
    }
}

class Products {
    int modelNo;
    String productName;

    Products(int model, String name) {
        modelNo = model;
        productName = name;
    }

    void display() {
        System.out.println("Product ID =" + modelNo + " " + "Product name =" + productName);
    }
}
