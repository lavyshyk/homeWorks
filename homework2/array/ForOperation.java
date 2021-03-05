package homework2.array;

import homework2.array.api.IArraysOperation;

public class ForOperation implements IArraysOperation {

    @Override
    public void printAllArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Override
    public void printEachSecondFromArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0){
                System.out.print(array[i] + " ");
            }
        }
    }

    @Override
    public void printArrayRecursion(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
