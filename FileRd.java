import java.io.FileReader;

public class FileRd {
    public static void main(String[] args) {
        char[] buff = new char[100];

        try {
        FileReader FileRead = new FileReader("C:\\Users\\hp\\OneDrive\\Documents\\test.txt");

            // Read Characters
            FileRead.read(buff);
            System.out.println("Data in the file: ");
            System.out.println(buff);
    
            // CLoses the reader
            FileRead.close();
        }

        catch(Exception e) {
            System.out.println("File is not found \n \t");
            e.getStackTrace();
        }

    }
}
