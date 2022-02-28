import java.util.Scanner;
interface Shapable {
    abstract double area(double x, double y);
    abstract double perimeter(double x, double y);
}

class Circle implements Shapable{
    public double area(double radius, double z) {
        double area = 3.14 * radius * radius;
        return area;
    }
    public double perimeter(double radius, double z) {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }
}

class Rectangle implements Shapable{
    public double area(double length, double breadth) {
        double area = length * breadth;
        return area;
    }
    public double perimeter(double length, double breadth) {
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }
}

public class InterfaceAssign {
    public static void main(String[] args) {
        Shapable c1 = new Circle();
        double z = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();
        double a1 = c1.area(r,z);
        System.out.println("Area of circle with radius " + r + " is " + a1);
        double b1 = c1.perimeter(r,z);
        System.out.println("Perimeter of circle with radius "+ r + " is " + b1);

        Shapable c2 = new Rectangle();
        System.out.println("Enter the length of the rectangle");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle");
        double b = sc.nextDouble();
        double a2 = c2.area(l, b);
        System.out.println("Area of rectangle with length " + l + " breadth " + b + " is " + a2);
        double b2 = c2.perimeter(l, b);
        System.out.println("Perimeter of rectangle with length " + l + " breadth " + b + " is " + b2);
    }
}