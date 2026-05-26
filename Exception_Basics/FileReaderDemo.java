
package Exception_Basics;
import java.io.*;
class FileMissingException extends RuntimeException {
    public FileMissingException(String message) {
        super(message);
    }
}
public class FileReaderDemo {
    public static void main(String[] args) {
        String fileName = "test.txt"; 
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new FileMissingException("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
