package homework1.tasks;

import java.util.Scanner;

/**
 * Вводится целое число, обозначающее код символа по таблице ASCII. Определить,
 * это код английской буквы или какой-либо иной символ.
 */

public class TableASCII {
    public static void main(String[] args) {

        int n = 0;
        boolean flag = true;

        Scanner in = new Scanner(System.in);


        while (flag){
            System.out.print("Введите число (0..255) : ");
            n = in.nextInt();
            System.out.println();
            if (n <= 0 || n >= 255){
                System.out.println("Число должно быть в диапозоне от 0 до 255 включительно. Будте внимательны!!");
            }else flag = false;
        }

        if (n > 64 && n < 91) {
            System.out.println("Чило соответсвует по ASCII таблице букве (заглавной) : " + ((char)n));
        }else if (n > 96 && n < 123){
            System.out.println("Чило соответсвует по ASCII таблице букве (прописной) : " + ((char)n));
        }else {
            System.out.println("Чило соответсвует по ASCII таблице символу : " + ((char)n));
        }


        in.close();
    }
}
