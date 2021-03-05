package homework1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class CommunicationPrinterTest {


    @ParameterizedTest
    @MethodSource("communicationPrinterArgument")

    public void welcome(ICommunicationPrinter communicationPrinter){
        assertEquals("Привет!" + "\n" + "Я тебя так долго ждал",
                communicationPrinter.welcome("Вася"));

        assertEquals("Я тебя так долго ждал",
                communicationPrinter.welcome("Анастасия"));

        assertNotEquals("Добрый день, а вы кто?",
                communicationPrinter.welcome("Вася"));

        assertNotEquals("Добрый день, а вы кто?",
                communicationPrinter.welcome("Анастасия"));


    }

    static Stream<Arguments> communicationPrinterArgument() {
       return Stream.of(
                arguments(new Home1_5_if()),
                arguments(new Home1_5_if_else_if()),
                arguments(new Home1_5_switch())
        );
    }

}
