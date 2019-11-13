package homework8;

public class TwoTwo extends TwoOne{
    public static void notCar(int a) throws MyExceptionTwo{
        System.out.println("Задание 2.2");
        if(a < 0) {
            throw new MyExceptionTwo("Ошибка");
        } else {
            System.out.println("Не машина, а что-то непонятное");
        }
        System.out.println("--------------");
    }
}
