package homework3.calcs.additional;

import homework3.calcs.api.ICalculator;

/**
 *  Создать класс CalculatorWithCounterAutoCompositeInterface.
 * 	9.1 Внутри класса нельзя создавать объекты, можно пользоваться только тем что передал вам пользователь вашего класса.
 * 	9.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	9.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
 * 	9.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики другим калькуляторам
 * 	переданным в конструктор
 * 	9.5 В классе должны присутствовать все методы объявленные в интерфейсе.
 * 	9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного
 * 	калькулятора. При вызове данного метода счётчик учёта не увеличивается.
 * 	9.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод). В main
 * 	методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из
 * 	задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */


public class CalculatorWithCounterAutoCompositeInterface implements ICalculator{


    ICalculator calculator;
    long calcCount;

    public CalculatorWithCounterAutoCompositeInterface(ICalculator calculator){this.calculator = calculator;}

    public long getCountOperation() {
        return calcCount;
    }


    public double pow(double a, int b) {
        calcCount++;
        return calculator.pow(a, b);
    }


    public double abs(double a) {
        calcCount++;
        return calculator.abs(a);
    }


    public double sqrt(double a) {
        calcCount++;
        return calculator.sqrt(a);
    }



    public double div(double a, double b) {
        calcCount++;
        return calculator.div(a, b);
    }


    public double mult(double a, double b) {
        calcCount++;
        return calculator.mult(a, b);
    }


    public double minus(double a, double b) {
        calcCount++;
        return calculator.minus(a, b);
    }


    public double plus(double a, double b) {
        calcCount++;
        return calculator.plus(a, b);
    }


}
