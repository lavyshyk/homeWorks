package collections;

import collections.text.RegTextSpliterator;
import collections.text.api.ITextSpliterator;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class CollectionsMain4 {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(
                Path.of("F:\\program\\JD1\\HomeWork\\src\\collections\\Верн Жюль. Двадцать тысяч лье под водой - royallib.ru.txt"),
                        Charset.forName("windows-1251"));

       //System.out.println(text);

        ITextSpliterator spliterator = new RegTextSpliterator();
        String[] strings = spliterator.split(text);

        Set<String> unuiq = new HashSet<>();
        for (String s : unuiq) {
            unuiq.add(s);
        }
        System.out.println(unuiq);


    }




}
