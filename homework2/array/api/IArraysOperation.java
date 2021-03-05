package homework2.array.api;

/**
 * 2.3* Выполнить задание 2.2 иным способом. Создать интерфейс IArraysOperation с методами
 * из задания. Написать 4 отдельных класса и реализовать данный интерфейс:
 * 		2.3.1. DoWhileOperation - во всех методах можно использовать только do....while
 * 		2.3.2. WhileOperation - во всех методах можно использовать только while
 * 		2.3.3. ForOperation - во всех методах можно использовать только for
 * 		2.3.4. ForEachOperation - во всех методах можно использовать только foreach
 */

public interface IArraysOperation {

    void printAllArray(int[] a);

    void printEachSecondFromArray(int [] a);

    void printArrayRecursion(int[] a);

}
