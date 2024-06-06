import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
    public static void main(String[] args) {
        try {
            FileWriter f1 = new FileWriter("C:\\Users\\ses18\\Desktop\\Daily Task\\kavita.txt");
            try {
                f1.write("This is my java File.");
            } finally {
                f1.close();
            }
            System.out.println("Successfully wrote data in file");

        } 
        catch (IOException i)
        {
            System.out.println("i");
        }
    }
}
