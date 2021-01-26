package homework3.calcs.additional;

import homework3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long calcCount;



    public long getCountOperation() {
        return calcCount;
    }

    @Override
    public double pow(double a, int b) {
        calcCount++;
        return super.pow(a, b);
    }

    @Override
    public double abs(double a) {
        calcCount++;
        return super.abs(a);
    }

    @Override
    public double sqrt(double a) {
        calcCount++;
        return super.sqrt(a);
    }


    @Override
    public double div(double a, double b) {
        calcCount++;
        return super.div(a, b);
    }

    @Override
    public double mult(double a, double b) {
        calcCount++;
        return super.mult(a, b);
    }

    @Override
    public double minus(double a, double b) {
        calcCount++;
        return super.minus(a, b);
    }

    @Override
    public double plus(double a, double b) {
        calcCount++;
        return super.plus(a, b);
    }
}
