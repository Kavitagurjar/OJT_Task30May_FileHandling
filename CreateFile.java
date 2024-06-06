import java.io.*;

class CreateFile {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\ses18\\Desktop\\Daily Task\\kavita.txt");
        try {
            if (f1.createNewFile()) {
            System.out.println("File successfully Created. ");
        }
        else {
            System.out.println("File is not created./File Already Exist. ");
        }
    } catch (Exception e) {
            System.out.println("Exception Handled.");
        }

    }
}