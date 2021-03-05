package homework2.loops;

import java.util.Scanner;

import static java.util.regex.Pattern.matches;

/**
 * 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое
 * мы будем возводить, Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
 * Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
 * 		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
 * 		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */

public class Exponent3 {
   //public static void main(String[] args) {
   //
   //
   //    double  num = 0 ;
   //    int exp ;
   //
   //    Scanner in = new Scanner(System.in);
   //    String s = in.nextLine().replace(",", ".");
   //
   //    if(matches("\\D++",s)){
   //        System.out.println("Вводите цифры");
   //        return;
   //    }
   //    num = Double.parseDouble(s);
   //    exp = in.nextInt();
   //    //System.out.println(num + "   " + exp);
   //    System.out.println(String.format("%.2f ^ %d = %.2f",num,exp,getExp(num, exp)));
   //    in.close();
   //
   //}
    public static double getExp(double d, int k){
        double res = 1;
        for (int i = 1; i <= k; i++) {
             res = res * d;

        }
        return res;
    }



}
