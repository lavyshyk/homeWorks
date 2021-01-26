package homework3.runners;

import homework3.calcs.additional.CalculatorWithMemory;
import homework3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {

        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithMathCopy());

        //4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.45999999999998

        double result;

        result = calculator.pow((calculator.div(28, 5)), 2);
        System.out.println(calculator.getMemory());                       //31.359999999999996
        result = calculator.plus(calculator.mult(15, 7), result);
        System.out.println(calculator.getMemory());                       //136.35999999999999
        result = calculator.plus(4.1, result);
        System.out.println(calculator.getMemory());                       //140.45999999999998

        System.out.println(result);                                        //140.45999999999998


    }
}
