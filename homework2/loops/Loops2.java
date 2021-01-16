package homework2.loops;


import static java.util.regex.Pattern.matches;

/**
 * Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений
 * в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь
 * ввёл некорректные данные.
 * 		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
 * 		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
 * 		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
 */

public class Loops2 {


    public static void main(String[] args) {

        String s = "jhgjhgkj";//args[0].trim();



        if(matches("[А-я]+ | \\w",s)){
            System.out.println("Введено не число");
            return;
        }
        if(matches("[-]\\d+",s)){
            System.out.println("Введено отрицательное число");
            return;
        }





        if (matches("\\d++", s)) {

                char[] chars = s.toCharArray();
                int[] array = getArrayLong(chars);
                long res = getMul(array);
               // System.out.print("Ввели " + s + ", доджно получиться в консоли :  ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);
                    if (i < array.length - 1) {
                        System.out.print(" * ");
                    }
                }
                System.out.println(" = " + res);

        }else System.out.println("Введено не целое число");



    }
    public static int[] getArrayLong(char[] charsArr){
        int[] arr = new int[charsArr.length];
        for (int i = 0; i < charsArr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(charsArr[i]));
        }
        return arr;
    }

    public static long getMul(int[] a){
        long l = 1;
        long temp = l;

        for (int i : a) {
            temp = l * i;
            if(temp >= Long.MAX_VALUE) {
                System.out.println("Будьте, пожалуйста, скромнее - слишком большая строка цифр");
                break ;
            }
            l = temp;
        }
        return l;

    }

}
