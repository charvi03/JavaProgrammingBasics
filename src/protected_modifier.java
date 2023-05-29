public class protected_modifier {
    public static void main(String[] args) {
   pro1 p=new pro1();
   p.display();
    }
}
class pro{
    protected void display(){
        System.out.println("This is protected modifier");
    }
}
class pro1 extends pro{
    void print(){
        System.out.println("Extended class");
    }
}
