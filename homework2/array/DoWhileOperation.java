package homework2.array;

import homework2.array.api.IArraysOperation;

/**
 * во всех методах из интерфейса IArraysOperation можно использовать только do....while
 */

public class DoWhileOperation implements IArraysOperation {

    @Override
    public void printAllArray(int[] array) {
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        }while (i < array.length);
    }

    @Override
    public void printEachSecondFromArray(int[] array) {
        int i = 0;
        do {
            if(i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        }while (i < array.length);

    }

    @Override
    public void printArrayRecursion(int[] array) {
        int i = array.length-1;
        do {
            System.out.print(array[i] + " ");
            i--;
        }while (i >= 0);
    }
}
