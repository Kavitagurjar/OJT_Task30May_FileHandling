import java.io.File;

public class FileInfo {

    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\ses18\\Desktop\\Daily Task\\kavita.txt");
        if (f1.exists()) {
            System.out.println("File Name : " + f1.getName());
            System.out.println("File Location : " + f1.getAbsolutePath());
            System.out.println("File Writable : " + f1.canWrite());
            System.out.println("File Readable : " + f1.canRead());
            System.out.println("File Size : " + f1.length());
            // System.out.println("File Removed : "+f1.delete());

        }
        else {
            System.out.println("File does not Exists");
         }
    }
}
