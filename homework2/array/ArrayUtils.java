package homework2.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {

    public static int[] arrayFromConsole(){
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

    public static int[] arrayRandom(int size, int maxValueExclusion){
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0 ; i < array.length; i++) {
            array[i] = rand.nextInt(maxValueExclusion);
        }
        return array;
    }
}
