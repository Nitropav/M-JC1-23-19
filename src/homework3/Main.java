package homework3;

public class Main {

    public static void main(String[] args){

        multable();
        peremnoj();
        mulcifr();
        massiv();
        twoelem();
        twoelemnull();
        masclass();

    }

    public static void multable(){
        System.out.println("Таблица умножения");
        for (int i = 1; i < 10; i++) {
            System.out.println("---------------------");
            for (int j = 0; j <= 10; j++)
                System.out.println(i + " * " + j + " = " + i * j);
        }
    }

    public static void peremnoj(){
        System.out.println("Перемножение чисел");
        int z = 1;
        for (int i = 1; i < 7; i++){
            z *= i;
        }
        System.out.println(z);
    }

    public static void mulcifr(){
        System.out.println("Умножение цифр числа");
        int z = 345;
        int x;
        int a = 1;
        while (z > 0){
            x = z % 10;
            z /= 10;
            a *= x;
        }
        System.out.println(a);
    }

    public static void massiv(){
        System.out.println("Перебор всех чисел массива do...while");

        int[] h = new int[7];
        int i = 0;

        do {
            h[i] = i + 1;
            System.out.println(i + " число = " + h[i]);
            i++;
        }while (i < h.length);

        System.out.println("Перебор всех чисел массива while");

        int j = 0;

        while (j < h.length) {
            System.out.println(j + " число = " + h[j]);
            j++;
        }

        System.out.println("Перебор всех чисел массива for");

        for (int f = 0; f < 7; f++)
            System.out.println(f + " число = " + h[f]);

        System.out.println("Перебор всех чисел массива foreach");

        int q = 0;

        for (int l: h) {
            System.out.println(q + " число = " + l);
            q++;
        }
    }

    public static void twoelem(){
        System.out.println("Вывод каждого второго элемента массива");

        int[] h = new int[]{1, 3, 5, 7, 9, 11, 13};

        for (int i = 0; i < h.length; i++){
            if (i % 2 != 0){
                System.out.println(h[i]);
            }
        }
    }

    public static void twoelemnull(){
        System.out.println("Вывод каждого второго элемента массива с null");
        String[] h = new String[]{"1", "2", "3", "4", "5", "6", "7", null, "8", "9", "10"};
        for (int i = 0; i < h.length; i++){
            if (i % 2 != 0){
                System.out.println(h[i]);
                if(h[i] == null){
                    break;
                }
            }
        }
    }

    public static void masclass(){
        System.out.println("Массивы объектов классов");
        FootballClub[] footballClubs = new FootballClub[50];
        for (int i = 0; i < footballClubs.length; i++){
            if (i%2!=0){
                footballClubs[i] = new Juventus("juventus",1897);
            }
            else {
                footballClubs[i]=new Barcelona("barcelona",1899);
            }
            System.out.println(footballClubs[i]);
        }
    }
}
