package homework3.calcs.additional;

import homework3.calcs.api.ICalculator;
import homework3.calcs.simple.CalculatorWithMathCopy;

/**
 * 10.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора и обеспечить его
 * дополнительной функцией памяти. В принципе работает как калькулятор из реальной жизни.
 * 	10.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	10.3 Данный класс напрямую не умеет считать математику.
 * 	10.4 В классе должны присутствовать математические методы:
 * 		10.4.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
 * 		10.4.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 	10.5 Функция памяти работает через методы:
 * 		10.5.1 Записать в память результат выполнения последнего вызванного метода. У данного метода не должно быть параметров.
 * 		10.5.2 Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи нового
 * 		значения память перезаписывается.
 * 	10.6 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется создать
 * 	экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль
 * 	результат. В мэйне запрещается использование переменных для хранения значений участвующих в просчёте, а также
 * 	результатов работы методов калькулятора.
 */


public class CalculatorWithMemory extends CalculatorWithMathCopy {


    private ICalculator calculator;
    private double memoryNumber;


    public CalculatorWithMemory(CalculatorWithMathCopy calculator) {
        this.calculator = calculator;
    }

    @Override
    public double plus(double a, double b) {

        return memoryNumber = calculator.plus(a, b);    // можно было организовать запись в переменную через отдельный метод
                                                        // но как и в случае с методом incrementCountOperation() -  излишне
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
}
