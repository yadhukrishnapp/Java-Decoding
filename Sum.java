import java.util.Scanner;
public class Sum {
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);

    //Byte sum
    byte a,b;
    int sumByte=0;
    System.out.println("Enter first number");
    a=sc.nextByte();
    System.out.println("Enter Second number");
    b=sc.nextByte();
    sumByte=a+b;
    System.out.println("The byte sum is: "+sumByte);

    //Integer sum
    int x,y, sumInt=0;
    System.out.println("Enter first number");
    x=sc.nextInt();
    System.out.println("Enter Second number");
    y=sc.nextInt();
    sumInt=x+y;
    System.out.println("The integer sum is: "+sumInt);

    // Short sum
    short c,d;
    int sumShort;
    System.out.println("Enter first number");
    c=sc.nextShort();
    System.out.println("Enter Second number");
    d=sc.nextShort();
    sumShort=c+d;
    System.out.println("The short number sum is: "+sumShort);

    //Long sum
    long a1,a2, sumLong=0;
    System.out.println("Enter first number");
    a1=sc.nextLong();
    System.out.println("Enter Second number");
    a2=sc.nextLong();
    sumLong=a1+a2;
    System.out.println("The long number sum is: "+sumLong);

    //Float sum
    float a3,a4, sumFloat=0;
    System.out.println("Enter first number");
    a3=sc.nextFloat();
    System.out.println("Enter Second number");
    a4=sc.nextFloat();
    sumFloat=a3+a4;
    System.out.println("The float number sum is: "+sumFloat);
    
    //Double sum
    double n,m, sumDouble=0;
    System.out.println("Enter first number");
    n=sc.nextDouble();
    System.out.println("Enter Second number");
    m=sc.nextDouble();
    sumDouble=n+m;
    System.out.println("The double number sum is: "+sumDouble);
    }
}
