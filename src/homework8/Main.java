package homework8;

public class Main {
    public static void main(String[] args) throws MyException, MyExceptionTwo{
        One one = new One();

        one.one();
        try {
            one.two();
        } catch (Exception e) {

        }
        one.three();

        TwoOne twoOne = new TwoOne();

        try {
            twoOne.car(4);
        } catch (MyException e) {
            twoOne.car(3);
        }

        TwoTwo twoTwo = new TwoTwo();

        try {
            twoTwo.notCar(0);
        } catch (MyExceptionTwo e) {
            twoTwo.notCar(2);
        }

        Three three = new Three();

        three.three();
    }
}

