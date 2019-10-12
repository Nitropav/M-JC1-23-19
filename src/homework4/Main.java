package homework4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        one();
        two();
        three();
        onelong();
        twolong();
        poisk();
        Poiskword poiskword = new Poiskword();
        poiskword.poiskWord();
        Wordvoina wordvoina = new Wordvoina();
        wordvoina.poiskWord();
    }

    public static void one(){
        System.out.println("=====================");
        String m ="Мама мыла рыбу";
        String m1 = "Мама" + " мыла" + " рыбу";
        System.out.println(m == m1);
    }

    public static void two(){
        System.out.println("=====================");
        String str = "Все супер";
        char[] chars = str.toCharArray();
        System.out.println(chars);
    }

    public static void three(){
        System.out.println("=====================");
        ArrayList<String> list = new ArrayList<>(0);
        String close = "exit";
        while (true){
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if(str.equals(close)){
                scanner.close();
                break;
            }else {
                list.add(str);
                System.out.println(str);
            }
        }
    }

    public static long onelong(){
        System.out.println("=====================");
        String str;
        str = "012321";
        long z = Long.valueOf(str);
        System.out.println(z);
        return z;
    }

    public static long twolong(){
        System.out.println("=====================");
        String str;
        str = "012321";
        long z = Long.parseLong(str);
        System.out.println(z);
        return z;
    }

    public static void poisk(){
        System.out.println("=====================");
        String str = "Я люблю JAVA";
        System.out.println(str.matches("h*"));
        System.out.println(str.matches("h?"));
        System.out.println(str.matches("h+"));
    }
}
