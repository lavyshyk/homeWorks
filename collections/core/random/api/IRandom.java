package collections.core.random.api;

public interface IRandom {

    /**
     * генерирует рандомные числа типа int
     * @param min c
     * @param max по
     * @return рандомное число int
     */
    int randInt(int min, int max);

    /**
     *  генерирует рандомные числа типа double
     * @param min с
     * @param max по
     * @return  рандомное число double
     */
    double randDouble(double min, double max);

    /**
     * генерирует рандомные имена
     * @param min мин размер строки
     * @param max максимальная длинна имени
     * @return рандомную строку
     */
    String randString(int min, int max);

    /**
     * генерирует рандомный boolean
     * @return boolean
     */
    boolean randBoolean();
}
