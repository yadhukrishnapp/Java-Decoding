// import static java.lang.Math;

class Operations{
    static int a;
    static int x = 7;
    static int y = 10;
    static double z = 4.3;


    void add(){
        System.out.println(x + y);
    }

    void sub(){
        System.out.println(x - y);
    }

    void mul(){
        System.out.println(x*y);
    }
    void div(){
        System.out.println(x/y);
    }

    static void display(){
        System.out.println("Arithmetic Operations are : ");
    }
}


public class Artithmetic_operations {
    public static void main(String[] args) {

    Operations.display();

    Operations a = new Operations();
    a.add();
    a.sub();
    a.div();
    a.mul();
    }
}
