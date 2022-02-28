class MyObj {

    MyObj() {
        System.out.println("This is the default empty constructor");
    }
    
    MyObj(String s1) {
        System.out.println("This is the parameterised constructor");
    }


    public void display(int x) {
        System.out.println("Area of square is = " + x*x);
    }

    public void display(double y, double z) {
        System.out.println("Area of rectangle is = " + y*z);
    }

    public void display_(double w) {
        System.out.println("Area of circle is = " + 3.14*w*w);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
       MyObj m = new MyObj();
       MyObj m1 = new MyObj();

       m.display(7);
       m.display(7, 10);
       m.display_(10);

    }
}
