package homework2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class Loops1_1Test {


    @Test
    @DisplayName("Тест факториала")
    public void getFactorialTest(){
        Assertions.assertEquals(40320, Loops1_1.getFactorial(8));
        Assertions.assertEquals(120, Loops1_1.getFactorial(5));
        Assertions.assertEquals(6, Loops1_1.getFactorial(3));
        Assertions.assertEquals(479_001_600, Loops1_1.getFactorial(12));
    }

}
