package homework1.tasks;

import java.util.Scanner;

/**
 * Пусть a, b, c - переменные, которым присваиваются введенные числа,
 * а переменная m в конечном итоге должна будет содержать значение наибольшей переменной.
 */

public class MaxNumber {
    public static void main(String[] args) {
        int a, b, c, m;

        Scanner in = new Scanner(System.in);



        System.out.println("Введите три разных числа  : ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        m = a;

        if (a == b || b == c || c == a) {
            System.out.println(" Ввод некорректен - нужны три РАЗНЫХ числа");

        } else  if (b > m) {
                m = b;
                }
                if (c > m) {
                     m = c;
                }
        System.out.println("Наибольшее число : " + m);
        in.close();
    }


}
