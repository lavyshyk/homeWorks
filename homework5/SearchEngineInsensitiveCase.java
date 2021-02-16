package homework5;

import homework5.api.ISearchEngine;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngineInsensitiveCase implements ISearchEngine {

    private ISearchEngine iSearchEngine;


    public SearchEngineInsensitiveCase(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }



    @Override
    public long search(String text, String word) {
        long count = 0;
        text = text.toLowerCase();
        word = word.toLowerCase();

        if(this.iSearchEngine instanceof RegExSearch){

            Pattern p = Pattern.compile(word,Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(text);
            while (m.find()){
                count++;
            }
            return count;

        }else if(this.iSearchEngine instanceof EasySearch){

            int index = 0;
            boolean flag = true;
            while (flag){
                index = text.indexOf(word, index);
                if(index != -1){
                    count++;
                    index = index + word.length();
                }else{
                    flag = false;
                }


            }
            return count;
        }else return 0;
    }
}
