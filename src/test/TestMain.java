package test;

public class TestMain {
    public static void main(String[] args) {
        test(1, 2, 3, 4, 55);
        test(1, 2, 3, 4, 9);
        test(1, 2, 3, 4, 65);
        test(1, 2, 3, 4, 55);
        test(1, 2, 3, 4, 2);
        test(1, 2, 3, 4, 1);
    }

    private static void test(Integer... arg){
        try {
            short result = MyMath.plus(arg);
            if(result != 65){
                throw new IllegalStateException("Что-то пошло не так");
            }
        }catch (Throwable t){
            System.out.println(t.getMessage());
            System.out.println(t.getCause());
        }
        System.out.println("Всё огонь, результат совпал");

    }
}
