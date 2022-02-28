import java.util.Scanner;
public class AddNum {
    public static void main(String[] args) {
        int sum = 0;
        byte[] numArray;
        Scanner sc = new Scanner(System.in);
        numArray = new byte[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter num" + i + "=\t");
            numArray[i] = sc.nextByte();
        }

        for (int i = 0; i < 5; i++) {
            sum = sum + (int)numArray[i];
        }
        System.out.println("Sum of the array is " + sum);
        sc.close();
        
    }
}