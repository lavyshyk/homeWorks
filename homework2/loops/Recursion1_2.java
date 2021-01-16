package homework2.loops;

/**
 *  Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
 * Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 * Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
 */

public class Recursion1_2 {
    public static void main(String[] args) {

        long num = Long.parseLong(args[0]);

        if(num >= 0 && num < Long.MAX_VALUE) {
            if (num == 0) {
                System.out.print("0!");
            }

            for (int i = 0; i < num; ) {
                System.out.print(++i);
                if (i < num) {
                    System.out.print(" * ");
                }
            }

            System.out.println(" = " + getFactorialByRecur(num));

        }
    }

    public static long getFactorialByRecur(long n){
        long f = n;

        if (n == 0 || n == 1){
            return 1;

        }else{
            return f = f * getFactorialByRecur(n - 1);
        }
    }
}
