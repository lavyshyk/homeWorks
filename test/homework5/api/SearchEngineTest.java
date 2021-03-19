package homework5.api;

import homework5.EasySearch;
import homework5.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class SearchEngineTest {

    @ParameterizedTest  (name = "{arguments}")
    @MethodSource("searchProvider")
    public void searchTest(ISearchEngine iSearchEngine){
        Assertions.assertEquals(1, iSearchEngine.search("привет, как дела!","дела"));
        Assertions.assertEquals(1, iSearchEngine.search("привет,какдела!","дела"));
        Assertions.assertEquals(1, iSearchEngine.search("привет;какдела!","привет"));
        Assertions.assertEquals(2, iSearchEngine.search("как дела!.Что делаешь?","де"));

    }

    public static Stream<Arguments> searchProvider(){
        return Stream.of(
                Arguments.arguments(new EasySearch()),
                Arguments.arguments(new RegExSearch())

        );
    }

}
