package collections.core.random.api;


import java.util.concurrent.ThreadLocalRandom;


import static java.util.regex.Pattern.matches;

public class Java8Random implements IRandom{


    /**
     * ���������� ��������� ����� ���� int
     * @param min c
     * @param max ��
     * @return ��������� ����� int
     */

    public int randInt(int min, int max){

        return ThreadLocalRandom.current().nextInt(min, max +1);
    }

    /**
     * ���������� ��������� ����� ���� double
     *
     * @param min �
     * @param max ��
     * @return ��������� ����� double
     */
    @Override
    public double randDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    /**
     * ���������� ��������� �����
     *
     * @param min ��� ������ ������
     * @param max ������������ ������ �����
     * @return ��������� ������
     */
    @Override
    public String randString(int min, int max) {

        int sizeString = ThreadLocalRandom.current().nextInt(min, max + 1);

        char c = 0;
        int n;
        StringBuilder s = new StringBuilder(sizeString);
        boolean flag = true;

        while (flag){
            n = ThreadLocalRandom.current().nextInt(1024, 1281);  // �������� �������� � �������

            c = (char) n ;
            StringBuilder temp2 = new StringBuilder().append(c);

            if(matches("[���������������������������������]", temp2)){
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

                if(matches("[���������������������������������]", temp3)){
                    flag =false;

                }
            } s.append(c);



        }



        return  s.toString();
    }

    /**
     * ���������� ��������� boolean
     *
     * @return boolean
     */
    @Override
    public boolean randBoolean() {

        return ThreadLocalRandom.current().nextBoolean();
    }
}
