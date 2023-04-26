public class staticVariable {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Aaryan");
        Student s2 = new Student(222, "Karan");
        s1.display();
        s2.display();
    }
}

class Student {
    int rollno;
    String name;
    static String college = "Amity";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

