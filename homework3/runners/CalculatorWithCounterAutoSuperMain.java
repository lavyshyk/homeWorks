package homework3.runners;

import homework3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();

        //4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.45999999999998

        double result;

        result = calculator.pow((calculator.div(28, 5)), 2);
        result = calculator.plus(calculator.mult(15, 7), result);
        result = calculator.plus(4.1, result);

        System.out.println(result);                            //140.45999999999998
        System.out.println(calculator.getCountOperation());    //   5  вызовов калькулятора
    }
}
