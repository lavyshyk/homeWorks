package homework5;



import homework5.api.ISpliteratorText;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpliteratorText implements ISpliteratorText {

    @Override
    public String[] splitByRegEx(String text) {
        Pattern p =  Pattern.compile("[А-аЯ-я0-9]{1}[А-аЯ-я0-9-]*");
        Matcher m = p.matcher(text);

        ArrayList<String> words = new ArrayList<>();
        while (m.find()){
            String word = text.substring(m.start(), m.end());

            words.add(word);
        }
        return words.toArray(new String[0]);
    }

    @Override
    public String[] splitByIndexOf(String text) {
        int index = 0;
        ArrayList<String> words = new ArrayList<>();

        while (index != -1){
            String word = text.substring(index, (index = text.indexOf(" ")));
            if (word.indexOf(".,\\\"()!?")!= 1){

            }
        }
        return new String[0];
    }
}
