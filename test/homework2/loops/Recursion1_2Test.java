package homework2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Recursion1_2Test {

    @ParameterizedTest(name = "{displayName} число {0}! -> факториал числа = {1}")
    @MethodSource("argumentsSource")
    public void getFactorialByRecur(long l , long ll){

        Assertions.assertEquals(ll,Recursion1_2.getFactorialByRecur(l));
    }

    public static Stream<Arguments> argumentsSource(){
        return Stream.of(
                Arguments.arguments(8L, 40320L),
                Arguments.arguments(5L, 120L),
                Arguments.arguments(12L, 479_001_600L)
        );
    }
}
