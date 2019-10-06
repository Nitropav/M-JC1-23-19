package homework2;

public class Task4 {

    public static void main(String[] args) {

        Hdd h1 = new Hdd(666);
        Ram r1 = new Ram(88);
        Computer c1 = new Computer(r1, h1);

        System.out.println(c1 instanceof Computer); // true
        System.out.println(c1 instanceof IComputer); // true
    }
}
