package tasckcode.strings;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Количество строчных и прописных букв в строке
 Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.

 Ввести две переменные для подсчета строчных и прописных букв. Присвоить им нули.
 Перебирая символы строки от первого до последнего (номер последнего определяется длиной строки),
 если очередной символ - это буква, которая не меньше "a" и не больше "z", то увеличить на 1 переменную-счетчик строчных букв,
 иначе аналогично проверить принадлежность символа диапазону от "A" до "Z". Если символ ему принадлежит, то увеличить счетчик прописных букв.
 *
 */

public class LowerAndUppercase {

    private int countUp;
    private int countLow;


    public int getCountUp() {
        return countUp;
    }

    public int getCountLow() {
        return countLow;
    }

    /**
     * ничего не возврашает, но увеличевает значение соответствующего поля объекта
     * countUp - количество прописных букв
     * countlow - количество строчных букв
     * @param s  - принимает текст для анализа количества букв
     */

    public void counterOfLetter(String s){
        char[] chars = s.toCharArray();

        for (char c : chars) {

            if (Character.isUpperCase(c)) {                  // мачим большие прописные (английского или русского текста)
                this.countUp++;}
            if (Character.isLowerCase(c)) {
                this.countLow++;
            }
        }
    }

    /**
     * countUp - количество прописных букв
     * countlow - количество строчных букв
     * @param s
     */
    public void counterOfLetter2(String s){
        Pattern p = Pattern.compile("[A-ZА-Я]");
        Matcher m = p.matcher(s);
        while (m.find()){
            countUp++;
        }
        Pattern pattern = Pattern.compile("[a-zа-я]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            countLow++;
        }
    }


    /**
     * Методы для подсчета соответствующего регистра (второй способ)
     * @param s строка для анализа
     * @return количество прописных
     */

    public int counterUppercase (String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c >= 'A' & c <= 'Z') {
                count++;
            }
        }
        return count;
    }

    public int counterLowercase (String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c >= 'a' & c <= 'z') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String testTextEng = "if for some reason you do a bootleg/unlicensed version of one my songs i will do my " +
                "best to make sure it's NOT taken down. i love bootlegs";

        String testTextRus = "вести две переменные для подсчета строчных и прописных букв. Присвоить им нули." +
                " Перебирая символы строки от первого до последнего (номер последнего определяется длиной строки)," +
                " если очередной символ - это буква, которая не меньше a и не больше z, то увеличить на 1 " +
                "переменную-счетчик строчных букв," +
                " иначе анало";

        LowerAndUppercase lowerAndUppercase = new LowerAndUppercase();
        lowerAndUppercase.counterOfLetter(testTextEng);
        System.out.println("Количество прописных - " + lowerAndUppercase.getCountUp() + " и строчных букв - " +
                lowerAndUppercase.getCountLow());

        LowerAndUppercase lowerAndUppercase1 = new LowerAndUppercase();  //  если не создать новый объект, то результат
                                                                         // двух текстов просуммируеться
        lowerAndUppercase1.counterOfLetter(testTextRus);
        System.out.println("Количество прописных - " + lowerAndUppercase1.getCountUp() + " и строчных букв - " +
                lowerAndUppercase1.getCountLow());

        LowerAndUppercase lowerAndUppercase2 = new LowerAndUppercase();  //  если не создать новый объект, то результат
                                                                         // двух текстов просуммируеться
        lowerAndUppercase2.counterOfLetter2(testTextRus);
        System.out.println("Количество прописных - " + lowerAndUppercase2.getCountUp() + " и строчных букв - " +
                lowerAndUppercase2.getCountLow());

        System.out.println(lowerAndUppercase1.counterUppercase(testTextEng));
        System.out.println(lowerAndUppercase.counterLowercase(testTextEng));

    }

}
