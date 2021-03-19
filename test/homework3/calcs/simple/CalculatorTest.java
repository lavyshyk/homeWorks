package homework3.calcs.simple;

import homework3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import homework3.calcs.additional.CalculatorWithCounterAutoDecorator;
import homework3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTest {


    @ParameterizedTest(name = "{argumentsWithNames}")
    @MethodSource("calcProvider")
    public void multyCalculatorTest(ICalculator calculator){
        Assertions.assertEquals(140.45999999999998,
                calculator.plus(4.1, calculator.plus(calculator.mult(15, 7),
                        calculator.pow(calculator.div(28, 5), 2))));
    }

    public static Stream<Arguments> calcProvider(){
         return Stream.of(
                arguments(new CalculatorWithMathCopy()),
                arguments(new CalculatorWithOperator()),
                arguments(new CalculatorWithMathExtends()),
                arguments(new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathCopy())),
                arguments(new CalculatorWithCounterAutoDecorator(new CalculatorWithOperator()))
                );
    }
}
