import java.util.Scanner;
public class assignment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

				int n;
				System.out.println("Enter a number");
				n=sc.nextInt();
				
				int fact=1;
				for(int i=1;i<=n;i++){    
					fact=fact*i;    
				}    
				System.out.println("Factorial of "+n+" is: "+fact);    

				sc.close();

    }
}
