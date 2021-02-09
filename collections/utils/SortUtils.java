package collections.utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortUtils {

    public static <T> void bubbleSort(List<T> container, Comparator<T> comparator){

    boolean flag = true;
    int lengthContainer = container.size();

        while (flag){
        int count = 0;
        for (int i = 0; i <lengthContainer-1; i++) {
            T left = container.get(i);
            T right = container.get(i + 1);

            int compare = comparator.compare(left, right);
            if(compare > 0){
                container.set(i, right);
                container.set(i + 1, left);
                count += 1;
            }
        }
        if(count == 0) {
            flag = false;
        }
    }

}

    public static <T> void shakerSort(List<T> container, Comparator<T> comparator){
        boolean flag = true;
        int lengthContainer = container.size();

        while (flag) {
            int count = 0;

            for (int i = 0; i < lengthContainer - 1; i++) {

                T left = container.get(i);
                T right = container.get(i + 1);
                int compare = comparator.compare(left, right);
                if (compare > 0) {
                    container.set(i, right);
                    container.set(i + 1, left);
                    count += 1;
                }

            }

            for (int i = lengthContainer - 1; i > 0; i--) {

                T left = container.get(i - 1);
                T right = container.get(i);
                int compare = comparator.compare(left, right);
                if (compare > 0) {
                    container.set(i, right);
                    container.set(i + 1, left);
                    count += 1;
                }
            }
            if (count == 0) {
                flag = false;
            }
        }
    }
}
