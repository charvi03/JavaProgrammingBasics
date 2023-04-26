public class constructor_overloading_this {
    double width,height,depth;
    int boxNo;
    constructor_overloading_this(double w,double h,double d,int num){
        width = w;
        height = h;
        depth = d;
        boxNo=num;
    }
    constructor_overloading_this(){
        width = height = depth = 0;
    }
    constructor_overloading_this(int num){
        this();
        //this() is used for calling the default constructor from parameterized constructor
        boxNo=num;
    }
    public static void main(String[] args) {
        constructor_overloading_this cns=new constructor_overloading_this(1);
        System.out.println(cns.width);
    }
}

