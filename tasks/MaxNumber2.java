package tasks;

import java.util.Scanner;

/**
 * Пусть a, b, c - переменные, которым присваиваются введенные числа,
 * а переменная m в конечном итоге должна будет содержать значение наибольшей переменной.
 *
 *Вариант без переменной m
 */

public class MaxNumber2 {

    public static void main(String[] args) {
        int a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("ВВедите три разных числа : ");

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a == b || b == c || a == c){
            System.out.println(" Ввод некорректен - нужны три РАЗНЫХ числа");

            }else { if (a > b){
                         if(a > c){
                             System.out.println("Найбольшее число  : " + a);

                         }else System.out.println("Найбольшее число  : " + c);

                    }else if(b > c){
                            System.out.println("Найбольшее число : " + b);

                         }else System.out.println("Найбольшее число : " + c);

                  }



        in.close();
    }
}
