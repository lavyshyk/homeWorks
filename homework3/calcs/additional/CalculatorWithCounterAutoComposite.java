package homework3.calcs.additional;

import homework3.calcs.simple.CalculatorWithMathCopy;
import homework3.calcs.simple.CalculatorWithMathExtends;
import homework3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite{

    private long calcCount;




    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;


    public CalculatorWithCounterAutoComposite(CalculatorWithOperator obj){calculatorWithOperator = obj;}
    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy obj){calculatorWithMathCopy = obj;}
    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends obj){calculatorWithMathExtends = obj;};





    public long getCountOperation() {
        return calcCount;
    }


    /**
     * все методы проходят на проверку передаваемого объекта - своя реализация метода.
     * дабавили итерацию переменной calcCount для подсчета использования калькуляторов
     * @param a
     * @param b
     * @return
     */


    public double pow(double a, int b) {
        calcCount++;
        if(calculatorWithOperator != null){
            return calculatorWithOperator.pow(a, b);
        }else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.pow(a, b);
        }else  return calculatorWithMathExtends.pow(a, b);
    }

    public double abs(double a) {
        calcCount++;
        if(calculatorWithOperator != null){
            return calculatorWithOperator.abs(a);
        }else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.abs(a);
        }else  return calculatorWithMathExtends.abs(a);
    }


    public double sqrt(double a) {
        calcCount++;
        if(calculatorWithOperator != null){
            return calculatorWithOperator.sqrt(a);
        }else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.sqrt(a);
        }else  return calculatorWithMathExtends.sqrt(a);
    }

    public double div(double a, int b) {
        calcCount++;
        if(calculatorWithOperator != null){
            return calculatorWithOperator.div(a, b);
        }else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.div(a, b);
        }else  return calculatorWithMathExtends.div(a, b);
    }

    public double mult(double a, double b) {
        calcCount++;
        if(calculatorWithOperator != null){
            return calculatorWithOperator.mult(a, b);
        }else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.mult(a, b);
        }else  return calculatorWithMathExtends.mult(a, b);
    }

    public double minus(double a, double b) {
        calcCount++;
        if(calculatorWithOperator != null){
            return calculatorWithOperator.minus(a, b);
        }else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.minus(a, b);
        }else  return calculatorWithMathExtends.minus(a, b);
    }

    public double plus(double a, double b) {
        calcCount++;
        if(calculatorWithOperator != null){
            return calculatorWithOperator.plus(a, b);
        }else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.plus(a, b);
        }else  return calculatorWithMathExtends.plus(a, b);
    }

}
