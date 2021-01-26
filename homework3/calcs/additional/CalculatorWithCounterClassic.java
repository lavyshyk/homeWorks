package homework3.calcs.additional;


import homework3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long calcCount;

    public void incrementCountOperation(){
        calcCount++;
    }
    public long getCountOperation() {
        return calcCount;
    }


}