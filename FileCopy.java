import  java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args)throws IOException {
        FileInputStream r = new FileInputStream("C:\\Users\\ses18\\Desktop\\Daily Task\\kavita.txt");
        FileOutputStream c = new FileOutputStream("C:\\Users\\ses18\\Desktop\\Daily Task\\copyfile.txt");

        int i;
        while((i = r.read())!=-1)
        {
            c.write(i);
        }
        System.out.println("Data copied Successfully.");
        r.close();
        c.close();

    }
}
