import java.util.Scanner;

class Rectangle {
    int length;
    int width;
    int area;
    String color;

    Rectangle(int l, int w, String c){
        length = l;
        width = w;
        color = c;
    }

    float Area(int l, int w){
        area = l * w;
        return area;
    }
}

public class Lab7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of the rectangle 1 : ");
        int l1 = sc.nextInt();
        System.out.println("Width of the rectangle 1 : ");
        int w1 = sc.nextInt();
        System.out.println("Color of the rectangle 1 : ");
        String c1 = sc.next();
        Rectangle r1 = new Rectangle(l1, w1, c1);
        
        System.out.println("Length of the rectangle 2 : ");
        int l2 = sc.nextInt();
        System.out.println("Width of the rectangle 2 : ");
        int w2 = sc.nextInt();
        System.out.println("Color of the rectangle 2 : ");
        String c2 = sc.next();
        Rectangle r2 = new Rectangle(l2, w2, c2);

        System.out.printf("\nRectangle 1 dimensions are : " + "\nlength = %d" + "\nwidth = %d" + "\ncolor = %s", l1, w1, c1);
        System.out.printf("\nRectangle 2 dimensions are : " + "\nlength = %d" + "\nwidth = %d" + "\ncolor = %s", l2, w2, c2);

        if ((r1.color.equals(r2.color)) && (r1.Area(l1, w1) == r2.Area(l2, w2))) {
            System.out.printf("\nRectangles are similar");
        }
        else {
            System.out.printf("\nRectangles are in mismatch");
        }
    }
}