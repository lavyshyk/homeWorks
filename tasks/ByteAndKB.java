package tasks;

import java.util.Scanner;

/**
 * В данной задаче пользователь должен ввести два значения: само число и как-либо указать, во что он хочет его перевести
 * (в байты или килобайты). Пусть выбор способа перевода указывается с помощью одного из двух символов.
 * Например, если пользователь введет букву "b", то число будет переводиться в байты, а если букву "k", то в килобайты.
 */

public class ByteAndKB {

    public static void main(String[] args) {
        int n;
        String l;

        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число : ");
        n = in.nextInt();
        System.out.println();
        System.out.print("Перевести в байты (b) или килобайты (к) : ");
        l = sc.nextLine();
        System.out.println();

        if(l.equals("b")){
            System.out.println(n + " Кбайт = " + (n * 1024) + " байт");
        }else if(l.equals("k")) {
            System.out.println( n + " байт = " + (n / 1024.0) + " Кбайт");
        }else System.out.println("Не понятно, в байты или Кбайты ?");

        in.close();
        sc.close();
    }
}
