package homework1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CreatePhoneNumberTest {

    Home1_6 ob = new Home1_6();


    @ParameterizedTest
    @MethodSource("argumentsSt")
    public void createPhoneNumberTest(int [] a ){
        assertAll("корректный номер",
                ()->assertTrue(a.length == 10),
                ()->assertTrue(ob.createPhoneNumber(a).matches("\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}"))
                );

    }

    public static Stream<Arguments> argumentsSt(){
        return Stream.of(
                arguments(new int[]{1, 2, 3, 6, 9, 8, 7, 9, 8, 9}),
                arguments(new int[]{1, 2, 0, 6, 9, 0, 7, 9, 8, 9})


        );
    }
}
