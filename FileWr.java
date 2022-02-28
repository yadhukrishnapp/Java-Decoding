import java.io.FileWriter;

public class FileWr {
    public static void main(String[] args) {
        String data = "This is the data in the output file";
        try {
            // Creates a writer using FileWriter
            FileWriter output = new FileWriter("C:\\Users\\hp\\OneDrive\\Documents\\write.txt");

            // Writes string to the file
            output.write(data);
            System.out.println("Data is written to the file.");

            // CLoses the writer
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
