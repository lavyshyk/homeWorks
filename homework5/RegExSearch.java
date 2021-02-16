package homework5;

import homework5.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long count = 0;
        Pattern p = Pattern.compile(word);
        Matcher m = p.matcher(text);
        while (m.find()){
            count++;
        }
        return count;
    }
}
