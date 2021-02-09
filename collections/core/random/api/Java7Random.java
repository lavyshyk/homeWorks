package collections.core.random.api;


import java.util.Random;

import static java.util.regex.Pattern.matches;

public class Java7Random implements IRandom {

    /**
     * ���������� ��������� ����� ���� int
     * @param min c
     * @param max ��
     * @return ��������� ����� int
     */

    public int randInt(int min, int max){

        Random rand = new Random();

        int randNum = rand.nextInt((max - min) + 1) + min;
        return randNum;
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

        Random rand = new Random();

        return rand.nextDouble() * 10 ;
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

        Random rand = new Random();
        int sizeString = rand.nextInt((max - min) +1) + min;

        char c = 0;
        int n;
        StringBuilder s = new StringBuilder(sizeString);
        boolean flag = true;

        while (flag){
            n = rand.nextInt((1280-1024)+1) + 1024;  // �������� �������� � �������
            c = (char) n ;
            StringBuilder temp1 = new StringBuilder().append(c);
            if(matches("[���������������������������������]", temp1)){
                flag = false;
            }
        }
        s.append(c);



        for (int i = 1; i < sizeString; i++) {
            flag = true;

            while (flag){
                n = rand.nextInt((1280 - 1024)+1) + 1024;
                c = (char) n;
                StringBuilder temp = new StringBuilder().append(c);

                if(matches("[���������������������������������]", temp)){
                    flag =false;
                }
            }

           s.append(c);

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
        Random rand = new Random();
        return rand.nextBoolean();
    }
}
