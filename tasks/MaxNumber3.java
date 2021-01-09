package tasks;

import java.util.Scanner;

/**
 * Пусть a, b, c - переменные, которым присваиваются введенные числа,
 * а переменная m в конечном итоге должна будет содержать значение наибольшей переменной.
 * Реаизация через статический метод в цикле зароса до  корректного ввода чисел пользователем.
 */

public class MaxNumber3 {
    public static void main(String[] args) {

        int m ;
        int b, c, a;


        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Введите три разных числа : ");

            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();

            m = getMaxNum(a,b,c);

        }while (m == Integer.MIN_VALUE);


        System.out.println("Наибольшее число : " + m);
        in.close();

    }
    public static int getMaxNum(int a, int b, int c){
         int res ;


         if(a == b || b == c || a == c){
             res = Integer.MIN_VALUE;
             System.out.println("Ввод некорректен - нужно три РАЗНЫХ числа.");
         }else if(a > b){

                 if(a > c) {
                     res = a;
                 }else res = c;

         }else if(b > c){
                    res = b;
                }else res = c;


         return res;
    }

}
