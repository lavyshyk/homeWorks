package homework5;

import homework5.api.ISearchEngine;

/**
 * 4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String.
 * В данной реализации запрещено использовать регулярные выражения в любом виде, для любых задач.
 * Данный класс ищет слова с учётом регистра.
 *
 */

public class EasySearch implements ISearchEngine {

    /**
     *  Метод возвращает информации о количестве раз которое встречается слово в тексте.
     *
     * @param text Первый параметр текст в котором ищем
     * @param word второй параметр что ищем в тексте.
     * @return количестве раз которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        long count = 0;
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
    }

}
