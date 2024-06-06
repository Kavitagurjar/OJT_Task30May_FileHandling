import java.io.FileReader;
import java.io.IOException;

public class FileReaderEg {
    // public static void main(String[] args) {
    //     try
    //     {
    //         FileReader f1 = new FileReader("C:\\Users\\ses18\\Desktop\\Daily Task\\kavita.txt");
    //         try
    //         {
    //             int i;
    //             while((i=f1.read())!=-1)
    //             {
    //                 System.out.print((char)i);
    //             }
    //         }
    //         finally
    //         {
    //             f1.close();
    //         }
    //     }
    //     catch(IOException e)
    //     {
    //         System.out.println("Exception Handled");
    //     }
    // }


    public static void main(String[] args) throws IOException {
        FileReader f1 = new FileReader("C:\\Users\\ses18\\Desktop\\Daily Task\\kavita.txt");
        int i;
        while((i=f1.read())!=-1)
        {
            System.out.print((char)i);
        }
         f1.close();   
    }


}
