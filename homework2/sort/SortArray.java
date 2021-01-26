package homework2.sort;

import homework2.array.AllArrayMain;


import java.util.Arrays;
import java.util.Random;

/**
 * 4.1. После каждой сортировки в консоли у вас должно получиться "[Какой массив был до сортировки] ->
 * [Каким стал массив после сортировки]". Для преобразования массива в текст можно использовать класс Arrays.
 * 	4.2. Пишем следующие алгоритмы:
 * 		4.2.1. Пузырьковая сортировка
 * 		4.2.2. Шейкерная сортировка
 * 	4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
 * 		4.3.1. {1,2,3,4,5,6}
 * 		4.3.2. {1,1,1,1}
 * 		4.3.3. {9,1,5,99,9,9}
 * 		4.3.4. {}
 * 	4.4. После тестов написать код который будет создавать массив рандомной длинны, заполнять массив рандомными числами.
 * 	Отсортировать.
 * 	4.5. После рандома написать код который будет создавать массив руками через консоль. Отсортировать.
 */

public class SortArray {
    public static void main(String[] args) {

        int[] ar1 = {1,2,3,4,5,6};      // test
        int[] ar2 = {1,1,1,1};
        int[] ar3 = {9,1,5,99,9,9};
        int[] ar4 = {};

        getBubbleSort(ar1);
        getBubbleSort(ar2);
        getBubbleSort(ar3);
        getBubbleSort(ar4);

        getShake(ar1);
        getShake(ar2);
        getShake(ar3);
        getShake(ar4);

        Random rand = new Random();              //После тестов написать код который будет создавать массив рандомной
                                                 // длинны, заполнять массив рандомными числами. * 	Отсортировать.
        int randSize = rand.nextInt(100);
        int maxValue = rand.nextInt(100);
        int[] container = AllArrayMain.arrayRandom(randSize, maxValue);
        getShake(container);
        int[] container2 = AllArrayMain.arrayRandom(randSize, maxValue);
        getBubbleSort(container2);

        //	4.5. После рандома написать код который будет создавать массив руками через консоль. Отсортировать.

        int[] container3 = AllArrayMain.arrayFromConsole();
        getBubbleSort(container3);
        getShake(container3);


    }
    

    public static void getBubbleSort(int[] array){
        boolean flag = true;

        long start = System.currentTimeMillis();

        System.out.println("Bubble sort");

        System.out.print(Arrays.toString(array) + " -> ");
        while (flag){
            int count = 0;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i + 1]){
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    count += 1;
                }

            }
            if(count == 0) {
                flag = false;
            }
        }
        System.out.println(Arrays.toString(array));
        long time = System.currentTimeMillis() - start;
        System.out.println(time);
    }

    public static void getShake(int[] array){
        boolean flag = true;

        long start = System.currentTimeMillis();

        System.out.println("Shake sort");

        System.out.print(Arrays.toString(array) + " -> ");
        while (flag){
            int count = 0;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i + 1]){
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    count += 1;
                }

            }
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] < array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    count +=1;
                }

            }
            if(count == 0) {
                flag = false;
            }
        }

        System.out.println(Arrays.toString(array));
        long time = System.currentTimeMillis() - start;
        System.out.println(time);

    }
}
