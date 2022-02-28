import java.util.Scanner;

class Obj {
    public double area(double r) {
        double a = 3.14 * r *r; 
        return a;
    }

    public double area(double l1, double b1) {
        double a = l1 * b1; 
        return a;
    }  

    public double area(float x) {
        float a = x * x; 
        return a;
    }    
}

public class Area {
    public static void main(String[] args) {
        Obj n = new Obj();

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double r = sc.nextDouble();
        System.out.printf("Area of the circle is " + n.area(r));

        System.out.println("\nEnter the length of rectangle");
        double l1 = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        double b1 = sc.nextDouble();
        System.out.printf("Area of the rectangle is " + n.area(l1, b1));

        System.out.println("\nEnter the length of square");
        float x = sc.nextFloat();
        System.out.printf("Area of the square is " + n.area(x));

    }
}