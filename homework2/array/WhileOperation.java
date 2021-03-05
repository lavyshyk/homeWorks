package homework2.array;

import homework2.array.api.IArraysOperation;

/**
 * во всех методах IArraysOperation можно использовать только while
 */

public class WhileOperation implements IArraysOperation {
    @Override
    public void printAllArray(int[] array) {
        int i = 0;
        while (i < array.length){
            System.out.print(array[i] + " ");
            i++;
        }
    }

    @Override
    public void printEachSecondFromArray(int[] array) {
        int i = 0;
        while (array.length > i) {
            if(i % 2 != 0) {
                System.out.print(array[i] + "  ");
            }
            i++;
        }

    }

    @Override
    public void printArrayRecursion(int[] array) {
        int i = array.length-1;
        while (i >= 0){
            System.out.print(array[i] + " ");
            i--;
        }
    }
}
