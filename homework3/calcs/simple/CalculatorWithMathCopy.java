package homework3.calcs.simple;

import homework3.calcs.api.ICalculator;

/**
 *  Создать класс CalculatorWithMathCopy.
 * 	3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	3.2 В классе должны присутствовать математические методы:
 * 		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение). Скопировать базовые
 * 		математические операции из CalculatorWithOperator.
 * 		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 		Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
 *
 */

public class CalculatorWithMathCopy implements ICalculator {


    // Скопировать базовые математические операции из CalculatorWithOperator.


    public double div(double a , double b){
        if(b != 0){
            return a / b;
        }
        return -1.0;   // деление но ноль невозможно
    }

    public double mult(double a, double b){
        return  a * b;
    }

    public double minus(double a, double b){
        return a - b;
    }

    public double plus(double a , double b){
        return a + b;
    }


    public double pow(double a, int b){

        return Math.pow(a, b);
    }
    public double abs(double a){
        return Math.abs(a);
    }

    public double sqrt(double a){
        return Math.sqrt(a);
    }



}
