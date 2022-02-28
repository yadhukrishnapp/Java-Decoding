import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
       Scanner num1 = new Scanner(System.in);
       float sum = 0;
       System.out.println("Enter the first real number");
       float i = num1.nextFloat();
       System.out.println("Enter the second real number");
       float j = num1.nextFloat();
       sum = i + j;
    System.out.println("Sum is " + sum);
}
