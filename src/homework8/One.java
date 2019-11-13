package homework8;

public class One {
    static int z = 10;
    static int x = 0;

    public static void one() {
        System.out.println("Задание 1.1");
        try {
            int a = z/x;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль");
        }
        System.out.println("---------------");
    }

    public static void two() {
        System.out.println("Задание 1.2");
        try {
            int a = z/x;
        } finally {
            System.out.println("Ошибка без catch");
            System.out.println("---------------");
        }
    }

    public static void three() {
        System.out.println("Задание 1.3");
        try {
            int a = z/x;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль");
        } finally {
            System.out.println("А я выполняюсь в любом случае");
        }
        System.out.println("------------------");
    }
}
