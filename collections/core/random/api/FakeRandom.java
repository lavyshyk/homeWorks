package collections.core.random.api;

public class FakeRandom implements IRandom{
    /**
     * генерирует рандомные числа типа int
     *
     * @param min c
     * @param max по
     * @return рандомное число int
     */
    @Override
    public int randInt(int min, int max) {
        return 12;
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
        return 12.3;
    }

    /**
     * генерирует рандомные имена
     *
     * @param min мин размер строки
     * @param max максимальная длинна имени
     * @return рандомную строку
     */
    @Override
    public String randString(int min, int max) {
        return "fjfj";
    }

    /**
     * генерирует рандомный boolean
     *
     * @return boolean
     */
    @Override
    public boolean randBoolean() {
        return false;
    }
}
