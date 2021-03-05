package collections.text;

import collections.text.api.ITextSpliterator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTextSpliterator implements ITextSpliterator {
    @Override
    public String[] split(String text) {
        Pattern p =  Pattern.compile("[А-аЯ-я0-9]+");
        Matcher m = p.matcher(text);
        int i = 0;
        String[] strings = new String[text.length()];
        if (m.find()){
            String s = text.substring(m.start(), m.end());
            i++;
            strings[i] = s;
        }
        return strings;
    }
}
