package homework2.loops;

/**
 *  1.5. Вывести таблицу умножения в консоль. В консоли должно получиться также как
 *  и на картинке (динозаврика рисовать не надо):
 *  https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
 */

public class MutTable5 {
    public static void main(String[] args) {

        String form = "%2d * %2d = %2d";
        int size = form.length() - 1;


        for (int i = 1; i <= 10; i++) {

            for (int j = 2; j < 6 ; j++) {

                String s = String.format(form, j, i, (i * j));

                System.out.print(s);

                if (j < 5) {
                    System.out.print(" |");
                } else {
                    System.out.println();

                }
            }
        }
        for (int i = 0; i < (size * 4); i++) {  // кривовато
            System.out.print("-");

        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {

            for (int j = 6; j < 10 ; j++) {

                String s = String.format(form, j, i, (i * j));

                System.out.print(s);

                if (j < 9) {
                    System.out.print(" |");
                } else {
                    System.out.println();

                }
            }
        }

    }
}
