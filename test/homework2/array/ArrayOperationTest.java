package homework2.array;

import homework2.array.api.IArraysOperation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

public class ArrayOperationTest {

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }


    @ParameterizedTest(name = "{displayName} тестируем метод {arguments}")
    @MethodSource("argumentsStream")
    public void printAllArrayTest(IArraysOperation arraysOperation){
        arraysOperation.printAllArray(new int[]{1,2,3,6,5});
        Assertions.assertEquals("1 2 3 6 5 ", output.toString());
    }

    @ParameterizedTest(name = "{displayName} тестируем метод {arguments}")
    @MethodSource("argumentsStream")
    public void printEachSecondFromArray(IArraysOperation arraysOperation){
        arraysOperation.printAllArray(new int[]{1,2,3,6,5,8,9,5,6});
        Assertions.assertEquals("1 2 3 6 5 8 9 5 6 ", output.toString());
    }

    @ParameterizedTest(name = "{displayName} тестируем метод {arguments}")
    @MethodSource("argumentsStream")
    public void printArrayRecursion(IArraysOperation arraysOperation){
        arraysOperation.printAllArray(new int[]{1,2,3,6,5,7,9,6,8,9,});
        Assertions.assertEquals("1 2 3 6 5 7 9 6 8 9 ", output.toString());
    }

    public static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.arguments(new DoWhileOperation()),
                Arguments.arguments(new WhileOperation()),
                Arguments.arguments(new ForOperation()),
                Arguments.arguments(new ForEachOperation())
        );
    }

    @AfterEach
    public void cleanStream(){ System.setOut(null);
    }

}
