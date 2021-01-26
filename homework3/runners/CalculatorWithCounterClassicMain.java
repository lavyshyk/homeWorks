package homework3.runners;

import homework3.calcs.additional.CalculatorWithCounterClassic;

/**
 * реализация данного класс требует вызова метода incrementCountOperation() после кахдого обращения к данному
 * калькулятору.   НЕ ЗАБЫВАЙТЕ ВЫЗЫВАТЬ МЕТОД)
 */

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        //4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.45999999999998

        double result;

        result = calculator.div(28, 5);
        calculator.incrementCountOperation();
        result = calculator.pow(result, 2);
        calculator.incrementCountOperation();
        double resultAdd = calculator.mult(15, 7);
        calculator.incrementCountOperation();
        result = calculator.plus(resultAdd, result);
        calculator.incrementCountOperation();
        result = calculator.plus(4.1, result);
        calculator.incrementCountOperation();


        System.out.println(result);                          //140.45999999999998
        System.out.println(calculator.getCountOperation());  // 5



    }
}
