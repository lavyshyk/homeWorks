package homework1;

public class Home1_6 {
    public static void main(String[] args) {
        int[] a = {1,5,6,9,2,0,6,8,1,2};
        Integer[] n = {1, 5, 6, 9, 5, 6, 9, 8,9,8};
      //  String s = createPhoneNumber(a);
       // System.out.println(s);
        System.out.println(createPhoneNumber(n));

    }
    public static String createPhoneNumber(int[] array){

        return  String.format("(%d%d%d) %d%d%d-%d%d%d%d", array[0], array[1], array[2], array[3], array[4],array[5],
                    array[6], array[7], array[8], array[9]);
    }
    public static String createPhoneNumber(Integer[] array){

        return  String.format("(%d%d%d) %d%d%d-%d%d%d%d", (Object[]) array);
    }
}
