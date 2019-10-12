package homework4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Poiskword implements IPoisk {

    private int w = 0;
    private int w2 = 0;
    private int souz = 0;
    private int souz2 = 0;
    private int m = 0;
    private int m2 = 0;

    public void poiskWord() throws IOException {
        System.out.println("=====================");
        File file = new File("D:/Война и мир.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] z = new byte[fileInputStream.available()];
        fileInputStream.read(z);
        String str = new String(z);
        w = str.indexOf("война");
        String[] w1 = str.split(" +");
        for (int i = 0; i < w1.length; i++){
            if(w1[i].equals("война")){
                w2++;
            }
        }
        System.out.println("война " + w2);

        souz = str.indexOf("и");
        String[] souz1 = str.split(" +");
        for (int i = 0; i < w1.length; i++){
            if(souz1[i].equals("и")){
                souz2++;
            }
        }
        System.out.println("и " + souz2);

        m = str.indexOf("мир");
        String[] m1 = str.split(" +");
        for (int i = 0; i < m1.length; i++){
            if(m1[i].equals("мир")){
                m2++;
            }
        }
        System.out.println("мир " + m2);
    }
}
