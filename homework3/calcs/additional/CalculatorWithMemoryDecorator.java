package homework3.calcs.additional;

import homework3.calcs.api.ICalculator;
import homework3.calcs.api.ICalculatorWithGetClass;

public class CalculatorWithMemoryDecorator implements ICalculatorWithGetClass {


    private ICalculator calculator;
    private double memoryNumber;


    public CalculatorWithMemoryDecorator(ICalculator calculator) {   // расширинная реализация CalculatorWithMemory
        this.calculator = calculator;
    }

    @Override
    public double plus(double a, double b) {

        return memoryNumber = calculator.plus(a, b);

    }

    @Override
    public double minus(double a, double b) {
        return memoryNumber = calculator.minus(a, b);
    }

    @Override
    public double mult(double a, double b) {
        return memoryNumber = calculator.mult(a, b);
    }

    @Override
    public double div(double a, double b) {
        return memoryNumber = calculator.div(a, b);
    }

    @Override
    public double abs(double a) {
        return memoryNumber = calculator.abs(a);
    }

    @Override
    public double sqrt(double a) {
        return memoryNumber = calculator.sqrt(a);
    }

    @Override
    public double pow(double a, int b) {
        return memoryNumber = calculator.pow(a, b);
    }

    /**
     *      Записать в память результат выполнения последнего вызванного метода. У данного метода не должно быть параметров.
     *   	Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи нового
     *      значения память перезаписывается.
     * @return последнюю запись в переменную memory
     */

    public double getMemory(){
        double temp = memoryNumber;
        memoryNumber = 0;
        return temp;
    }

    @Override
    public String getWrapClass() {
        return calculator.getClass().toString();
    }
}
