package homework5;


import homework5.api.ISearchEngine;
import homework5.api.ISpliteratorText;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static java.lang.Class.forName;

public class CollectionsMain {
    public static void main(String[] args) throws IOException {

        String text = Files.readString(
                Path.of("F:\\program\\JD1\\HomeWork\\src\\homework5\\Война и мир_книга.txt")
                        ,Charset.defaultCharset());


        //2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.

        Set<String> setWords = new HashSet<>();
        ISpliteratorText spliteratorText = new SpliteratorText();

        String[] wordsArr = spliteratorText.splitByRegEx(text);

        for (String s : wordsArr) {
            setWords.add(s);

        }

        //В конце выводим в консоль количество использованных слов.
        System.out.println("Количество уникальных слов " + setWords.size());



        printTopWords(text, spliteratorText, 20);  // п 2,2



        /**
         * 4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String.
         * В данной реализации запрещено использовать регулярные выражения в любом виде, для любых задач.
         * Данный класс ищет слова с учётом регистра.
         * test
         */

        String word = "слово";
        EasySearch easySearch = new EasySearch();
        long count = easySearch.search(text, word);

        System.out.print("Реализация EasySearch : ");
        System.out.println(word + " - " + count + " раз");

        /**
         * 4.2* Написать класс RegExSearch реализующий интерфейс ISearchEngine.
         * Реализовать поиск при помощи класса Matcher.
         * Данный класс ищет слова с учётом регистра.
         */

        RegExSearch regExSearch = new RegExSearch();
        long countReg = regExSearch.search(text, word);

        System.out.print("Реализация RegExSearch : ");
        System.out.println(word + " - " + count + " раз");


        /**
         * 4.3* Написать декоратор SearchEnginePunctuationNormalizer для ISearchEngine который будет удалять
         * нежелательные символы. Любые знаки препинания, лишние пробелы и например переводы строк.
         */


        /**
         *4.4* Написать декоратор для ISearchEngine который будет позволять искать данные без учёта регистра.
         *
         */

        SearchEngineInsensitiveCase engineInsensitiveCase = new SearchEngineInsensitiveCase(new RegExSearch());

        System.out.println("ВоЙнА  -- " + engineInsensitiveCase.search(text, "ВоЙнА"));


        /**
         * 5. Используя реализации интерфейса ISearchEngine вывести информацию как часто встречаются слова "война",
         * "и" (как союз), "мир" вне зависимости от регистра.
         */

        SearchEngineInsensitiveCase engineInsensitiveCase1 = new SearchEngineInsensitiveCase(new EasySearch());

        System.out.println("война  -- " + engineInsensitiveCase.search(text, "ВоЙнА"));
        System.out.println(" и  -- " + engineInsensitiveCase.search(text, " и "));
        System.out.println("мир  -- " + engineInsensitiveCase.search(text, "мир"));







    }

    /**
     * 2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
     * Отсортировать по количеству.
     * !!!!!Распечатать в консоль.
     * @param text   исходный текст
     * @param spliteratorText определяет метод разделения текста на слова
     * @param n  количестао топ слов, встречающихся в тексте
     */
    public static void printTopWords(String text, ISpliteratorText spliteratorText, int n){
        String[] words = spliteratorText.splitByRegEx(text);
        Map<String, Integer> map = new HashMap<>();  // cохраняем слова как уникальные ключи, а в значение - количество их повторений

        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            }else{
                map.put(word, map.get(word) + 1 );
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());// cортируем при помощи list'a  слова --- индекс - количество повторений слова в тексте

        list.sort(new Comparator<Map.Entry<String, Integer>>() {     // анонимный класс, сортируем по колличеству раз встречающегося слова
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        }.reversed());

        for (int i = 0; i < n; i++) {

            System.out.println(list.get(i).getKey() + " - " + list.get(i).getValue() + " раз");

        }
    }
}
