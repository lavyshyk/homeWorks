package homework1.tasks;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Дана следующая функция y=f(x):
 * y = 2x - 10, если x > 0
 * y = 0, если x = 0
 * y = 2 * |x| - 1, если x < 0
 *
 * Требуется найти значение функции по переданному x.
 */

public class Func {
    public static void main(String[] args) {

        int x, y;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите хначение x = ");
        x = in.nextInt();
        System.out.println();

        if(x == 0){
            y = 0;
        }else if(x > 0){
            y = 2 * x - 10;
        }else {
            y = 2 * abs(x) -1;
        }

        System.out.println("Значение f() = " + y + "  при x = " + x);

        in.close();

    }
}
