package homework2.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class SortUtilsTest {

    @ParameterizedTest(name = "{displayName} палучаем массив на сортировку{0} -> {1}")
    @MethodSource("argumentsStream")
    public void bubbleSortTest (int[] a, int[] b){
         Assertions.assertArrayEquals(b, SortUtils.bubbleSort(a));
    }

    @ParameterizedTest(name = "{displayName} палучаем массив на сортировку{0} -> {1}")
    @MethodSource("argumentsStream")
    public void shakeSortTest (int[] a, int[] b){
         Assertions.assertArrayEquals(b, SortUtils.shakeSort(a));
    }
    public static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.arguments(new int[]{1,46,98,631,1,9,3,8}, new int[]{1,1,3,8,9,46,98,631}),
                Arguments.arguments(new int[]{1,46,98,631,1,9,3,8,900,1036}, new int[]{1,1,3,8,9,46,98,631,900,1036}),
                Arguments.arguments(new int[]{1,46,98,631,1,9,3,8,12,13}, new int[]{1,1,3,8,9,12,13,46,98,631})
                );
    }
}
