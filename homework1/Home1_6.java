package homework1;

/**
 * createPhoneNumber рядом с методом main, данный метод будет принимает один параметр и будет возвращать
 * строку в отформатированном виде. В метод будет передаваться массив из 10 цифр (от 0 до 9).
 * Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX.
 */

public class Home1_6 {

        int[] a = {1,5,6,9,2,0,6,8,1,2};
        Integer[] n = {1, 5, 6, 9, 5, 6, 9, 8,9,8};
      //  String s = createPhoneNumber(a);
       // System.out.println(s);

    public  String createPhoneNumber(int[] array){

        return  String.format("(%d%d%d)%d%d%d-%d%d%d%d", array[0], array[1], array[2], array[3], array[4],array[5],
                    array[6], array[7], array[8], array[9]);
    }
    public String createPhoneNumber(Integer[] array){

        return  String.format("(%d%d%d) %d%d%d-%d%d%d%d", (Object[]) array);
    }
}
