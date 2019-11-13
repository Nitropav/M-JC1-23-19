package homework8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Three {
    public static void three() {
        System.out.println("Задание 3");
        System.out.println("Введите 5 чисел ");

        int[] arr = new int[5];
        int a = 0;
        ArrayList<Integer> arrayList = new ArrayList();
        if (a <= 2){
            for (int i = 0; i < arr.length; i++) {
                try {
                    arr[i] = Integer.parseInt(new Scanner(System.in).nextLine());
                } catch (NumberFormatException e) {
                    if(a < 3) {
                        System.out.println("Некорректный ввод");
                        a++;
                        i--;
                    }
                    else {
                        System.out.println("Больше 3 ошибок");
                        break;
                    }
                }
            }
        } else
            System.out.println("Больше 3");

        for (int i=0; i < arr.length; i++){
            arrayList.add(i, arr[i]);
        }
        Collections.sort(arrayList);
        for (int i: arrayList) {
            System.out.println(i);
        }
    }
}
