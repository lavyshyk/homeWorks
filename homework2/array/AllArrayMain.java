package homework2.array;

import java.util.Random;
import java.util.Scanner;

/**
 * 2.1 Написать метод public static int[] arrayFromConsole() рядом с main. Данный метод размер массива и каждый его
 * элемент запрашивает у пользователя через консоль. Пример int[] container = arrayFromConsole(). Результат: В методе
 * arrayFromConsole будет запрошена информация у пользователя, пользователь вводит размер (3) и его элементы по порядку
 * {4, 17, 32}. Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
 * 	2.2 Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя метод
 * 	arrayFromConsole(). Все задачи в одном классе, в отдельных методах.
 * 		2.2.1 Вывести все элементы в консоль.
 * 		2.2.2 Вывести каждый второй элемент массива в консоль.
 * 		2.2.3 Вывести все элементы массива в консоль в обратном порядке.
 * 	2.3 Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main. Данный метод
 * 	принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
 * 	Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа. Пример:
 * 	int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет создан массив размером 5 с числами
 * 	от 0 до 99 (использовать класс Random) и сохранён в переменную container.
 */

public class AllArrayMain {
    public static void main(String[] args) {


        final int M1 = 1, M2 = 2, M3 = 3; // 3 флага для работы методов (2.2.1 - М1 ... 2.2.3 - М3)  = 4 метода вместо 12
        //int[] container = arrayFromConsole();
        int[] container = arrayRandom(5, 10);

        arrayByDoWhile(1, container);
        arrayByDoWhile(2, container);
        arrayByDoWhile(3, container);

        arrayByWhile(1, container);
        arrayByWhile(2, container);
        arrayByWhile(3, container);

        arrayByFor(1, container);
        arrayByFor(2, container);
        arrayByFor(3, container);

        arrayForeach(1, container);
        arrayForeach(2, container);
        arrayForeach(3, container);

    }
    public static int[] arrayFromConsole(){      // пункт 2.2

        int k = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Ведите размер будущего массива :");

        try {
            k = in.nextInt();
        }catch (Exception e){
            System.out.println("Вводите только целые числа");
        }
        int[] array = new int[k];

        System.out.println("Введите элементы массива : ");

        for (int i = 0; i < k ; i++) {
            try{
                array[i] = in.nextInt();
            }catch (Exception e){
                System.out.println("Необходимо вводить только ЦЕЛЫЕ числа");
            }
        }
        return array;
    }

    public static void arrayByDoWhile(int flag , int[] array){

        System.out.println();
        System.out.println("\n do...while");
        if(flag == 1){
            int i = 0;
            System.out.println("вывод по порядку:");
            do {
                System.out.print(array[i] + " ");
                i++;
            }while (i < array.length);
        }

        if(flag == 2){
            System.out.println("вывод по порядку - каждый второй :");
            int i = 0;
            do {
                if(i % 2 != 0) {     // каждый второй элемент = {  , i2 ,  , i4 , ....}
                    System.out.print(array[i] + " ");
                }
                i++;
            }while (i < array.length);
        }

        if(flag == 3){
            System.out.println("вывод по обратному порядку:");
            int i = array.length-1;
            do {
                System.out.print(array[i] + " ");
                i--;
            }while (i >= 0);
        }
    }

    public static void arrayByWhile(int flag , int[] array){

        System.out.println();
        System.out.println("\n while");

        if(flag == 1){
            int i = 0;
            System.out.println("вывод по порядку:");

            while (i < array.length){
                System.out.print(array[i] + " ");
                i++;
            }
        }

        if(flag == 2){
            int i = 0;
            System.out.println("вывод по порядку - каждый второй :");

            while (array.length > i) {

                if(i % 2 != 0) {     // каждый второй элемент = {  , i2 ,  , i4 , ....}
                    System.out.print(array[i] + "  ");
                }
                i++;
            }
        }

        if(flag == 3){
            System.out.println("вывод по обратному порядку:");
            int i = array.length-1;
            while (i >= 0){
                System.out.print(array[i] + " ");
                i--;
            }
        }
    }

    public static void arrayByFor(int flag, int[] array){

        System.out.println();
        System.out.println("\n  for");

        if(flag == 1){
            System.out.println("вывод по порядку:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        if(flag == 2){
            System.out.println("вывод по порядку - каждый второй :");
            for (int i = 0; i < array.length; i++) {
                if(i % 2 != 0){
                    System.out.print(array[i] + " ");
                }
            }
        }
        if(flag == 3){
            System.out.println("вывод по обратному порядку:");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void arrayForeach(int flag, int[] array){
        System.out.println();
        System.out.println("\n Foreach ");

        if (flag == 1){
            System.out.println("вывод по порядку:");
            for (int i : array) {
                System.out.print(i + " ");
            }
        }if (flag == 2){
            System.out.println("вывод по порядку - каждый второй :");
            int k = 0;
            for (int i : array) {
                if(k % 2 != 0){
                    System.out.print(i + " ");
                }
                k++;
            }
        }if (flag == 3){
            System.out.println("вывод по обратному порядку:");
            int[] temp = new int[array.length];
            int k = array.length-1;
            for (int i : array) {
                temp[k] = i;
                k--;
            }
            for (int i : temp) {
                System.out.print(i + " ");

            }
        }
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){

        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0 ; i < array.length; i++) {
           array[i] = rand.nextInt(maxValueExclusion);
        }
        return array;
    }



}
