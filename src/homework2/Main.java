package homework2;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task5();
    }

    public static void Task1(){

        int z = 32;
        int a = 2;
        int i, f;

        i = z << a;
        f = z >> a;
        System.out.println("Положительное влево: " + i);
        System.out.println("Положительное вправо: " + f);
    }

    public static void Task2(){

        int z = -32;
        int a = 2;
        int i, f;
        double s = 13.2;

        i = z << a;
        f = z >> a;
        //System.out.println(s >> 2); // с дробными оператор >> не работает
        System.out.println("Отрицательное влево: " + i);
        System.out.println("Отрицательное вправо: " + f);
    }

    public static void Task3(){

        int z = 32;
        int a = 2;

        String answer = (z < a) ? "Правильно!" : "Не правильно!";
        System.out.println("Ответ: " + answer);
        if (z > a){
            answer = "Правильно!";
        }else {
            answer = "Не правильно!";
        }
        System.out.println("Ответ: " + answer);
    }

    public static void Task5(){

        int z1, z2, z3, z4, z5, z6, z7;
        boolean z8, z9;
        int f = 2;
        int a = 8;

        z1 = 5 + 2 / 8; // z1 = 5, так как z1 int
        System.out.println("5.1 " + z1);
        z2 = (5 + 2) / 8; // z2 = 0, так как z2 int
        // первое выполняется действие в скобках и отевет меньше 1
        System.out.println("5.2 " + z2);
        z3 = (5 + f++) / 8; // z3 = 0, так как ответ 7/8
        // ++ увеливает f на 1
        System.out.println("5.3 " + z3);
        z4 = (5 + f++) / --a; // z4 = 1, так как 8/7
        // ++ увеливает f на 1, а -- уменьшает а на 1
        System.out.println("5.4 " + z4);
        z5 = ((5 * 2) >> f++) / --a; // z5 = 0, так как 2/7
        // (10 >> 2)/7, так как int, то 0
        System.out.println("5.5 " + z5);
        z6 = (5 + 7 > 20 ? 68 : 22 * 2 >> f++) / --a; // z6 = 0
        // так как сумма меньше 20, то (22 >> 2) / 7, 5/7, а это 0
        System.out.println("5.6 " + z6);
        //z7 = (5 + 7 > 20 ? 68 => 68 : 22 * 2 >> f++) / --a;
        //System.out.println("5.7 " + z7); // не работает почему-то проблема
        z8 = 6 - 2 > 3 && 12 * 12 <= 119; // ответ false
        // так как 4 > 2 - это true, а вот 144 <= 119 - это false11
        // поэтому ответ false, для true нужно чтобы оба выражения были true
        System.out.println("5.8 " + z8);
        z9 = true && false; // ответ false, для true нужно чтобы оба выражения были true
        System.out.println("5.9 " + z9);
    }
}
