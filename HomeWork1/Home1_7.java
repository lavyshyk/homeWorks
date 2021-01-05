package HomeWork1;

public class Home1_7 {
    public static void main(String[] args) {
        byte a = 15;
        byte b = -15;
        byte c = 42;
        byte d = -42;

        toBinaryString(a);
        toBinaryString(b);
        toBinaryString(c);
        toBinaryString(d);

    }

    public static String toBinaryString(byte number){

        String s = String.format("%8s",Integer.toBinaryString(Math.abs(number))).replace(" ","0");

       if (number < 0){

           byte b = (byte) ((256 + (number))); /// дополнительный код отрицательного числа

           System.out.print(b + "  :   ");
           s = (Integer.toBinaryString(b)).substring(24);
           System.out.println(s);

       }else System.out.println(" " + number + "  :   " + s );


     return s;
    }

}
