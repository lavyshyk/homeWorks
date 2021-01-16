package homework2.array;

import java.util.Arrays;

/**
 * 2.4 Задачи взяты с сайта https://taskcode.ru/array. На сайте есть пояснения по каждой из этих задач.
 * Все задачи в одном классе, в отдельных методах.
 * 		2.4.1 Сумма четных положительных элементов массива
 * 		2.4.2 Максимальный из элементов массива с четными индексами
 * 		2.4.3 Элементы массива, которые меньше среднего арифметического
 * 		2.4.4 Найти два наименьших (минимальных) элемента массива
 * 		2.4.5 Сжать массив, удалив элементы, принадлежащие интервалу
 * 		2.4.6 Сумма цифр массива
 */

public class ArrayMain2 {
    public static void main(String[] args) {
       // int[] ar = {1,5,9,8,3,9};
        //int[] arr = subarrayFromArray(2, 4, ar);
        //System.out.println(Arrays.toString(arr));

    }

    public static int sumFromArray(int[] array){ //2.4.1 Сумма четных положительных элементов массива
        int sum = 0;
        for (int n : array) {
            if (n % 2 == 0 && n > 0) {
                sum += n;
            }
        }
        return sum;
    }

    public static int maxFromEven(int[] array){  //2.4.2 Максимальный из элементов массива с четными индексами
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0 && max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static int[] minFromAvrgOfArray(int[] array){ //2.4.3 Элементы массива, которые меньше среднего арифметического
        int avrg = sumOfArray(array)/array.length;
        int [] tempArr = new int[array.length];
        int count = 0;
        for (int i : array) {
            if (i < avrg){
                int j = 0;
                tempArr[j] = i;
                j++;
                count = j;
            }
        }
        int[] resArray = new int[count];
        for (int i = 0; i < resArray.length; i++) {
            resArray[i] = tempArr[i];
        }
        return resArray;
    }

    public static int[] subarrayFromArray(int start, int end, int[] array){
        int i = 0, j = 0;
        int[] resArray = new int[array.length-(end - start + 1)];

        while (i < array.length){
            if(i < start || i > end){
                resArray[j] = array[i];
                j++;
            }
            i++;
        }
        return resArray;
    }



    public static int sumOfArray(int[] array){//2.4.6 Сумма цифр массива
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
