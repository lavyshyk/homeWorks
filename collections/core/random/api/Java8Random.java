package collections.core.random.api;


import java.util.concurrent.ThreadLocalRandom;


import static java.util.regex.Pattern.matches;

public class Java8Random implements IRandom{


    /**
     * генерирует рандомные числа типа int
     * @param min c
     * @param max по
     * @return рандомное число int
     */

    public int randInt(int min, int max){

        return ThreadLocalRandom.current().nextInt(min, max +1);
    }

    /**
     * генерирует рандомные числа типа double
     *
     * @param min с
     * @param max по
     * @return рандомное число double
     */
    @Override
    public double randDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    /**
     * генерирует рандомные имена
     *
     * @param min мин размер строки
     * @param max максимальна€ длинна имени
     * @return рандомную строку
     */
    @Override
    public String randString(int min, int max) {

        int sizeString = ThreadLocalRandom.current().nextInt(min, max + 1);

        char c = 0;
        int n;
        StringBuilder s = new StringBuilder(sizeString);
        boolean flag = true;

        while (flag){
            n = ThreadLocalRandom.current().nextInt(1024, 1281);  // диапазон кирилицы в юникоде

            c = (char) n ;
            StringBuilder temp2 = new StringBuilder().append(c);

            if(matches("[®…÷” ≈Ќ√Ўў«’Џ‘џ¬јѕ–ќЋƒ∆Ёя„—ћ»“№Ѕё]", temp2)){
                flag = false;
            }
        }
        s.append(c);


        for (int i = 1; i < sizeString; i++) {
            flag = true;

            while (flag){
                n = ThreadLocalRandom.current().nextInt(1024, 1281);
                c = (char) n;
                StringBuilder temp3 = new StringBuilder().append(c);

                if(matches("[Єйцукенгшщзхъфывапролджэ€чсмитьбю]", temp3)){
                    flag =false;

                }
            } s.append(c);



        }



        return  s.toString();
    }

    /**
     * генерирует рандомный boolean
     *
     * @return boolean
     */
    @Override
    public boolean randBoolean() {

        return ThreadLocalRandom.current().nextBoolean();
    }
}
