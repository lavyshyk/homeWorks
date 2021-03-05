package homework2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LimitToLong4Test {

    @ParameterizedTest(name = "{displayName} получно число {0}, -> результат  переполнения {1}")
    @MethodSource("argumentsSource")
    public void getExpTest(int i, long res){

        Assertions.assertEquals(res, LimitToLong4.getLong(i));
    }

    public static Stream<Arguments> argumentsSource(){
        return Stream.of(
                Arguments.arguments(6, 4738381338321616896L ),
                Arguments.arguments(-19, 3265617043834753317L),
                Arguments.arguments(98694, 961329463239384L)
        );
    }
}
