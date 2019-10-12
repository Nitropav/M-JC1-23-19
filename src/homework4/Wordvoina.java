package homework4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wordvoina implements IPoisk {
    private int i = 0;
    @Override
    public void poiskWord() throws IOException {
        System.out.println("=====================");
        File file = new File("D:/Война и мир.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] z = new byte[fileInputStream.available()];
        fileInputStream.read(z);
        String str = new String(z);
        Pattern souzI = Pattern.compile(" +и +",Pattern.CASE_INSENSITIVE);
        Matcher souzI1 = souzI.matcher(str);
        while (souzI1.find()) {
          i++;
        }
        System.out.println("и " + i);
    }
}
