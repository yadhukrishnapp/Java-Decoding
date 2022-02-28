import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;

public class FileReadWrite {
    public static void main(String[] args) {
        char [] buff = new char[100];
        String Mydata = "Hello I am Yadhu this is the test string used for filehandling";
        Scanner sc = new Scanner(System.in);
        String Mydata2 = sc.nextLine();

        try {
            // Creates a Writer using FileWriter
            FileReader inputFile = new FileReader("C:\\Users\\hp\\OneDrive\\Documents\\a.txt");
            File f1 = new File("C:\\Users\\hp\\OneDrive\\Documents\\write.txt");
            FileWriter outputFile = new FileWriter(f1, true);
            // FileWriter outputFile = new FileWriter("C:\\Users\\hp\\OneDrive\\Documents\\write.txt");

            // Writes string to the file
            inputFile.read(buff);
            outputFile.write(buff);
            System.out.println(buff);
            System.out.println("Data is written into the file.");

            // Closes the Writer
            inputFile.close();
            outputFile.close();
        }
        catch (Exception e) {
            e.getStackTrace();
            System.out.println("File Not Found");
        }
    }
}
