package tasckcode.strings;

/**
 * Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.
 */

public class CountWords {
    public static void main(String[] args) {

        String s = "Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.";

        System.out.println("Количество слов в строке - " + getCountWords(s));  // 13
        System.out.println("Количество слов в строке - " + getCountWords2(s));  // 13

    }

    /**
     *
     * @param s строка для анализа
     * @return int  количество слов в стоке
     */

    public static int getCountWords(String s){
        return s.split(" ").length;
    }

    /**
     *
     * @param s строка для анализа
     * @return  int  количество слов в стоке
     */

    public static int getCountWords2(String s){
        int count = 0;
        boolean flag = true;   // для исключения ошибки (слова обычно более одной буквы)

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(c != ' ' && flag){
                count++;
                flag = false;
            }else if(c == ' '){
                flag = true;
            }
        }
        return count;
    }

}

