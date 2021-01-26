package homework3.runners;

import homework3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import homework3.calcs.simple.CalculatorWithMathCopy;
import homework3.calcs.simple.CalculatorWithMathExtends;
import homework3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoCompositeInterface calculator =
                new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy());

        double result1 = calculator.plus(4.1, calculator.plus(calculator.mult(15, 7),
                calculator.pow(calculator.div(28, 5), 2)));

        System.out.println(result1);                    //140.45999999999998
        System.out.println(calculator.getCountOperation()); // 5



        CalculatorWithCounterAutoCompositeInterface calculator2 =
                new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathExtends());

        double result2 = calculator2.plus(4.1, calculator2.plus(calculator2.mult(15, 7),
                calculator2.pow(calculator2.div(28, 5), 2)));

        System.out.println(result2);                    //140.45999999999998
        System.out.println(calculator2.getCountOperation()); // 5



        CalculatorWithCounterAutoCompositeInterface calculator3 =
                new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithOperator());

        double result3 = calculator3.plus(4.1, calculator3.plus(calculator3.mult(15, 7),
                calculator3.pow(calculator3.div(28, 5), 2)));

        System.out.println(result3);                    //140.45999999999998

        System.out.println(calculator3.getCountOperation()); // 5

    }
}
