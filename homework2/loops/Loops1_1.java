package homework2.loops;

/**
 * Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
 * Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 * Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
 */

public class Loops1_1 {
    public static void main(String[] args) {

        long num = Long.parseLong(args[0]);

        if(num >= 0 && num < Long.MAX_VALUE){
            if (num == 0){
                System.out.print("0!");
            }
            for (int i = 0; i < num ; ) {
                System.out.print(++i);
                if(i < num ){
                    System.out.print(" * ");
                }
            }


            System.out.println(  " = " + getFactorial(num));

            // вызов статического метод из другого класса(одного пакета)
            System.out.println("Получение результата через рекурсивный метод = " + Recursion1_2.getFactorialByRecur(num));

        }else System.out.println("Отрицательное число  или число больше - " + Long.MAX_VALUE);



    }

    public static long getFactorial(long n){

        long f = 1;

        for (int i = 0; i < n; ) {

            f *= (++i);

        }
        return f;
    }
}

