package homework3.runners;

public class WithoutCalculatorMain {
    static double resultTest;
    public static void main(String[] args) {


        resultTest = 4.1 + 15 * 7 + (double)28 /5 * 28 / (double) 5;   //140.45999999999998
        System.out.println(resultTest);

    }

    public static boolean testResult(double res){
        return resultTest == res;
    }

}
