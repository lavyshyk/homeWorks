package tasks;

import java.util.Scanner;

/**
 * Вводятся два целых числа. Проверить делится ли первое на второе. Вывести на экран сообщение об этом,
 * а также остаток (если он есть) и частное (в любом случае
 */

public class CheckDivision {

    public static void main(String[] args) {

        int a, b;

        Scanner in = new Scanner(System.in);

       do{
           System.out.println("Введите два числа(второе число не НОЛЬ) : ");

           a = in.nextInt();
           b = in.nextInt();
           if(b == 0) {
               System.out.println("Некорректный ввод");

           }

       }while (b == 0);

       if (a % b == 0){
           System.out.println(a + " делится без остатка на " + b + " = " + (a / b));
       }else{
           System.out.println(a + " не делиться на " + b);
           System.out.println("Частное = " + (a / b) + ", а остаток = " + (a % b));

       }
       in.close();

    }
}
