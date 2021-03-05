package homework2.loops;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1.4.* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением
 * до переполнения и после переполнения. Умножать на:
 *     	1.4.1. 3
 *     	1.4.2. 188
 *     	1.4.3. -19
 *     	1.4.4. Да и вообще на любое целочисленное
 */

public class LimitToLong4 {
    //public static void main(String[] args) {
    //
    //    Scanner in = new Scanner(System.in);
    //    int n = 0;
    //   try {
    //       n = in.nextInt();
    //   }catch (InputMismatchException exception){
    //       System.out.println("Вводите любые ЦЕЛЫЕ числа!!");
    //       return;
    //   }
    //    System.out.println("До переполнения : " + getLong(n));
    //
    //}
    public static long getLong(int k){
        final BigInteger M = BigInteger.valueOf(Long.MAX_VALUE);
        long a = 1L;
        BigInteger temp = BigInteger.valueOf(a);
        BigInteger b = BigInteger.valueOf(k);

        while (true){

            a = temp.longValue();
            temp = temp.multiply(b);

            int r = temp.compareTo(M);
            if( r == 1){
                break;
            }
        }
        //System.out.println("После переполнения : " + temp);
        return a;
    }
}
