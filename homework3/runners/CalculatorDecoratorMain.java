package homework3.runners;


import homework3.calcs.additional.CalculatorWithCounterAutoDecorator;
import homework3.calcs.additional.CalculatorWithMemoryDecorator;
import homework3.calcs.api.ICalculator;
import homework3.calcs.api.ICalculatorWithGetClass;
import homework3.calcs.simple.CalculatorWithMathCopy;
import homework3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMathExtends());

        double result1 = calc.plus(4.1, calc.plus(calc.mult(15, 7),
                calc.pow(calc.div(28, 5), 2)));

        System.out.println(result1);                                      //140.45999999999998

        if(calc instanceof CalculatorWithCounterAutoDecorator){
            CalculatorWithCounterAutoDecorator calculatorWithCount = (CalculatorWithCounterAutoDecorator) calc;

            long count = calculatorWithCount.getCountOperation();
            System.out.println(count);                                     //  5
            System.out.println(calculatorWithCount.getWrapClass());        //class homework3.calcs.simple.CalculatorWithMathExtends

        }


        ICalculatorWithGetClass calc2 = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());

        CalculatorWithMemoryDecorator calculatorWithMemory = null;

        if(calc2 instanceof CalculatorWithMemoryDecorator){
            calculatorWithMemory = (CalculatorWithMemoryDecorator) calc2;
        }

        double result;

        result = calculatorWithMemory.pow((calculatorWithMemory.div(28, 5)), 2);
        System.out.println(calculatorWithMemory.getMemory());                       //31.359999999999996
        result = calculatorWithMemory.plus(calculatorWithMemory.mult(15, 7), result);
        System.out.println(calculatorWithMemory.getMemory());                       //136.35999999999999
        result = calculatorWithMemory.plus(4.1, result);
        System.out.println(calculatorWithMemory.getMemory());                       //140.45999999999998

        System.out.println(result);                                                 //140.45999999999998


        /**
         * пробую разными  спрособами обрашаться к объектам и их методам( interface ICalculatorWithGetClass )
         */

        System.out.println(calc2.getWrapClass());                                    // class homework3.calcs.simple.CalculatorWithMathCopy


    }
}
