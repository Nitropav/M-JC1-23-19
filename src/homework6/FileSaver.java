package homework6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileSaver {
    public static void saveHistory() throws IOException {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("D:/History.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
