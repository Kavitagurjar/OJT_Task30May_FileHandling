import java.io.File;
public class FileRename {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\ses18\\Desktop\\Daily Task\\kavita.txt");
        File fr = new File("C:\\Users\\ses18\\Desktop\\Daily Task\\renamekavita.txt");
        
        if(f1.exists())
        {
            System.out.println(f1.renameTo(fr));
        }
        else {
            System.out.println("File does not exists...!");
        }

    }
    
}
