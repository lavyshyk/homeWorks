package HomeWork1;

public class Home1_2 {
    public static void main(String[] args) {

       // 2.1
        int result = 5 + 2 / 8;  // ответ 5  --  2/8 = 0  and  5+0 = 5
        System.out.println(result);

        //2.2

        result = (5 + 2) / 8;  // ответ 0 т.к.  5+2 = 7  and 7/8 = 0
        System.out.println(result);

        //2.3

        int a = 2;
        result = (5 + a++) / 8; // ответ 0 , a = 3  ---  5 + 2 = 7 ,   7 / 8 = 0
        System.out.println(result);


        //2.4

         a = 2;
        int b = 8;

        result = (5 + a++) / --b;   //ответ 1 , a = 3 , b = 7 ----   5 + 2 = 7 , 7 / 7 = 1
        System.out.println(result);


        //2.5  (5 * 2 >> 2++) / --8

        a = 2;
        b = 8;
        result = (5 * 2 >> a++) / --b; // ответ  0 , a = 3, b = 7 ----  5 * 2  = 10 , 10 >> 2 = 2 , 2 / 7 = 0
        System.out.println(result);


        //2.6   (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8

        a = 2;
        b = 8;
        result = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b; // ответ: 1 , a = 3 , b = 7  --- 5 + 7 > 20  =  false --> 22 * 2 = 44 ,
                                                            // 44 >> 2 = 11 , 11 / 7 = 1
        System.out.println(result);


        //2.7  (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8

        a = 2;
        b = 8;
       /// int result = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b; // ответ:   ошибка т.к.  результат тернерного оператора один типа boolean(68 >= 68),
        //  а второй типа int (22 * 2 >> a++);


        //2.8  6 - 2 > 3 && 12 * 12 <= 119

        boolean res = 6 - 2 > 3 && 12 * 12 <= 119; // ответ : false --- (6 - 2 > 3) = true AND 12 * 12 <= 119 = false
                                                    // --> true && false = false
        System.out.println(res);

        // 2.9 true && false

        boolean ress = true & false; // ответ : false --- true & false = false;;
        System.out.println(ress);






    }
}
