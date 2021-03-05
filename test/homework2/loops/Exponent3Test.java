package homework2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Exponent3Test {

    @ParameterizedTest(name = "{displayName} получно число {0},возвести в степень {1} -> {2}")
    @MethodSource("argumentsSource")
    public void getExpTest(double d, int i, double res){

        Assertions.assertEquals(res, Exponent3.getExp(d,i));
    }

    public static Stream<Arguments> argumentsSource(){
        return Stream.of(
                Arguments.arguments(18.0, 5,1_889_568.0 ),
                Arguments.arguments(7.5, 2, 56.25),
                Arguments.arguments(33.3, 3, 36926.03699999999)
        );
    }
}
