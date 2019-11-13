package homework8;

public class TwoOne {
    public static void car(int a) throws MyException {
        System.out.println("Задание 2.1");
        if(a < 4) {
            throw new MyException("Ошибка");
        } else {
            System.out.println("У машины " + a + " колеса");
        }
        System.out.println("--------------");
    }
}
