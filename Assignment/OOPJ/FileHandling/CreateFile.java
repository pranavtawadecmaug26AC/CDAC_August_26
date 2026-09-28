
import java.io.*;

public class CreateFile {

    public static void main(String[] args) {
        File fileObj = new File("file.txt");

        try {
            if (fileObj.createNewFile()) {
                System.out.println("file created");

                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write("Files in Java might be tricky, but it is fun enough!");
                myWriter.close();  // must close manually
            } else {
                System.out.println("can't be created");
            }
        } catch (Exception e) {
            System.err.println("e");
        }
    }
}
