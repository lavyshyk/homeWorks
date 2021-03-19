package homework2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Loops2Test {

    @ParameterizedTest(name = "{displayName} получен массив символов {0} -> массив чисел {1}")
    @MethodSource("argumentsSource")
    public void getArrayTest(char[] c ,int[] array){

        Assertions.assertArrayEquals(array, Loops2.getArrayLong(c));
    }

    public static Stream<Arguments> argumentsSource(){
        return Stream.of(
                Arguments.arguments("12369".toCharArray(),new int[]{1,2,3,6,9}),
                Arguments.arguments("12369695".toCharArray(),new int[]{1,2,3,6,9,6,9,5}),
                Arguments.arguments("12369000111".toCharArray(),new int[]{1,2,3,6,9,0,0,0,1,1,1})
        );
    }

    @ParameterizedTest(name = "{displayName} получен массив чисел {0} -> результат {1}")
    @MethodSource("argumentsSource2")
    public void getMulTest(int[] array,long l){

        Assertions.assertEquals(l, Loops2.getMul(array));
    }

    public static Stream<Arguments> argumentsSource2(){
        return Stream.of(
                Arguments.arguments(new int[]{1,2,3,6,9,}, 324L),
                Arguments.arguments(new int[]{1,2,3,6,9,6,9,5},87_480L),
                Arguments.arguments(new int[]{1,2,3,6,9,0,0,0,1,1,1}, 0L)
        );
    }

}
