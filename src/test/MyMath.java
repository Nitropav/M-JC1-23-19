package test;

public class MyMath {
    public static short plus(Integer... args){
        short result = 0;
        if(args.length > 0){
            for (Integer val : args) {
                result += val;
            }
        }
        return result;
    }

    public static double div(int a, int b){
        return a / b;
    }
}
