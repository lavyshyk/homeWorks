package homework3.runners;

import homework3.calcs.additional.CalculatorWithCounterAutoComposite;
import homework3.calcs.simple.CalculatorWithMathCopy;
import homework3.calcs.simple.CalculatorWithMathExtends;
import homework3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calc1 = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());
        CalculatorWithCounterAutoComposite calc2 = new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoComposite calc3 = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());



        double result1 = calc1.plus(4.1, calc1.plus(calc1.mult(15, 7),calc1.pow(calc1.div(28, 5), 2)));
        double result2 = calc2.plus(4.1, calc2.plus(calc2.mult(15, 7),calc2.pow(calc2.div(28, 5), 2)));
        double result3 = calc3.plus(4.1, calc3.plus(calc3.mult(15, 7),calc3.pow(calc3.div(28, 5), 2)));



       long count1 = calc1.getCountOperation();
       long count2 = calc2.getCountOperation();
       long count3 = calc3.getCountOperation();

       System.out.println(result1 + " " + result2 + " " + result3);//140.45999999999998
       System.out.println(count1 + " " + count2 + " " + count3);   // 5




    }
}
