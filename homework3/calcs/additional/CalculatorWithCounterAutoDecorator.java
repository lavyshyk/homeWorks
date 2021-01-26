package homework3.calcs.additional;

import homework3.calcs.api.ICalculator;
import homework3.calcs.api.ICalculatorWithGetClass;


public class CalculatorWithCounterAutoDecorator implements ICalculatorWithGetClass {


    private long calcCount;
    private ICalculator calculator;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }



    @Override
    public double plus(double a, double b) {
        calcCount++;
        return this.calculator.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        calcCount++;

        return this.calculator.minus(a, b);
    }

    @Override
    public double mult(double a, double b) {
        calcCount++;
        return this.calculator.mult(a, b);
    }

    @Override
    public double div(double a, double b) {
        calcCount++;
        return this.calculator.div(a, b);
    }

    @Override
    public double abs(double a) {
        calcCount++;
        return this.calculator.abs(a);
    }

    @Override
    public double sqrt(double a) {
        calcCount++;
        return this.calculator.sqrt(a);
    }

    @Override
    public double pow(double a, int b) {
        calcCount++;
        return this.calculator.pow(a, b);
    }

    public long getCountOperation() {
        return calcCount;
    }

    @Override
    public String getWrapClass() {
        return this.calculator.getClass().toString();
    }




}
