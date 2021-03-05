package homework2.array;

import homework2.array.api.IArraysOperation;

/**
 * во всех методах из интерфейса IArraysOperation можно использовать только foreach
 */

public class ForEachOperation implements IArraysOperation {
    @Override
    public void printAllArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    @Override
    public void printEachSecondFromArray(int[] array) {
        int k = 0;
        for (int i : array) {
            if(k % 2 != 0){
                System.out.print(i + " ");
            }
            k++;
        }
    }

    @Override
    public void printArrayRecursion(int[] array) {
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
