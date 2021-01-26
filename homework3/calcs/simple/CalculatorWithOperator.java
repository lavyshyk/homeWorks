package homework3.calcs.simple;

import homework3.calcs.api.ICalculator;

/**
 * Создать класс CalculatorWithOperator.
 * 	2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	2.2 В классе должны присутствовать математические методы:
 * 		2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый из этих методов должен
 * 		принимать два параметра (определитесь с их типами) и должны возвращать результат (определиться с возвращаемым
 * 		типом результата) при помощи ключевого слово return.
 * 		2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
 * 	2.3 В методах можно использовать любые арифметические операторы.
 * 	2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой, то для
 * 	реализации метода "Корень из числа" можно воспользоваться библиотекой Math.
 *
 */

public class CalculatorWithOperator implements ICalculator {

    /**
     *
     * @param a использую простые имена параметров т к методы короткие и понятны, выбрал тип параметров double т.к.
     *          при введениии любого примитивного будет производится расширение типа (автоматом)
     *
     * @param b
     * @return тип double   ++ в тестовом классе WithoutCalculatorMain  приводится все к типу double
     */


    public double div(double a , double b){
        if(b != 0.0){
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




    public double pow(double a, int b){    // по условию  int b
        double  res = 0;
        if (b < 0){
            System.out.print("Степень должна быть положительна ");
            res = -1.0;
        }
        if (b == 0){
            res =  1.0;
        }
        if (b > 0){
            res = a;
            for (int i = 2; i <= b; i++) {
                res = res * a;
            }
        }
        return res;
    }

    public double abs(double a){
        if (a < 0){
            return a * (-1);
        }
        return a;
    }

    public double sqrt(double a){
        return Math.sqrt(a);
    }



}
