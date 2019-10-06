package homework2;

public class Task6 {

    private Integer k;
    private int z;
    private int i;

    public void method() {
        i = k + z;
    }

    public static void main(String[] args) {
        Task6 t = new Task6();
        t.method();
        System.out.println(t.i);
    }

    // выдаёт ошибку NullPointerException
    // происходит это из-за того, что в классе нет конструктора
    // и не можем использовать переменные, использованные в этом методе
    // создаем переменную, но не создаем объект типа Task6
}
