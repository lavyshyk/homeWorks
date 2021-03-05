package homework1;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SleepInTest {

    Home1_4 obj = new Home1_4();


    @ParameterizedTest (name = "Можно спать? {index} если true, то выходной")
    @MethodSource(("argumentsStream"))
    public void sleepInTest(boolean a, boolean b){
        assertTrue(obj.sleepIn(a,b),"ура выходной");
        }

        static Stream<Arguments> argumentsStream(){
            return Stream.of(
                    arguments(true,true),
                    arguments(false,true)
            );
        }


}
