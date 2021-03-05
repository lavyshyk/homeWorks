package homework2.sort;

import java.util.Arrays;

public class SortUtils {

    public static int[] bubbleSort(int[] array){
        boolean flag = true;
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
        return array;
    }

    public static int[] shakeSort(int[] array){
        boolean flag = true;
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
        return array;
    }
}
