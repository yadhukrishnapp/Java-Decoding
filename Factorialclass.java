import java.util.Scanner;
public class Factorialclass {
    public static void main(String[] args) {
       Scanner num = new Scanner(System.in);

    System.out.println("Enter a number : ");
    int i = num.nextInt();
    int fact = 1;
    for (int j = 1; j <= i; j++) {
        fact = fact * j;
    }
    System.out.println(fact);
    }
}
