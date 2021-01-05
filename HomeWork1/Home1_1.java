package HomeWork1;

public class Home1_1 {
    public static void main(String[] args) {
        int a = 42, b = 15;
        int c = -42, d = -15;

        printBinary(a);  // 101010
        printBinary(b);  // 1111
        printBinary(c);  // 11111111111111111111111111010110
        printBinary(d);  // 11111111111111111111111111110001
        System.out.println();

        // operator " ~ "
        System.out.println("Оператор ~ - NOT ");

        printBinary(~a);  // -43    11111111111111111111111111010101
        printBinary(~b);  // -16    11111111111111111111111111110000
        printBinary(~c);  // 41     101001
        printBinary(~d);  // 14     1110
        System.out.println();


        // operator  " & "
        System.out.println("Оператор &  - AND");

        printBinary((a & b));  // 10    1010
        printBinary((b & a));  // 10    1010
        printBinary((c % d));  // -12   11111111111111111111111111110100
        printBinary((d & c));  // -48   11111111111111111111111111010000
        System.out.println();


        // operator " | "
        System.out.println("Оператор  |  ");

        printBinary((a | b));  // 47    101111
        printBinary((b | a));  // 47    101111
        printBinary((c | d));  // -9    11111111111111111111111111110111
        printBinary((d | c));  // -9    11111111111111111111111111110111
        System.out.println();


        // operator " ^ "
        System.out.println(" Оператор  ^  ");

        printBinary((a ^ b));  // 37    100101
        printBinary((b ^ a));  // 37    100101
        printBinary((c ^ d));  // 39    100111
        printBinary((d ^ c));  // 39    100111
        System.out.println();


        // operator's  ">>" ">>>" "<<"

        System.out.println("Побитовые операторы сдвига для числа 42 ( сдвигаем на 2)");

        printBinary((a >> 2));  // 10   1010
        printBinary((a >>> 2)); // 10   1010
        printBinary((a << 2));  // 168  10101000
        System.out.println();

        System.out.println("Побитовые операторы сдвига для числа 15 ( сдвигаем на 2)");

        printBinary((b >> 2));   // 3   11
        printBinary((b >>> 2));  // 3   11
        printBinary((b << 2));   // 60  111100
        System.out.println();


        System.out.println("Побитовые операторы сдвига для числа -42 ( сдвигаем на 2)");

        printBinary((c >> 2));   // -11          11111111111111111111111111110101
        printBinary((c >>> 2));  // 1073741813   111111111111111111111111110101
        printBinary((c << 2));   // -168         11111111111111111111111101011000
        System.out.println();


        System.out.println("Побитовые операторы сдвига для числа -15 ( сдвигаем на 2)");

        printBinary((d >> 2));   // -4          11111111111111111111111111111100
        printBinary((d >>> 2));  // 1073741820  111111111111111111111111111100
        printBinary((d << 2));   // -60         11111111111111111111111111000100
        System.out.println();


        /// operator's  ">>=" ">>>=" "<<="

        System.out.println("Побитовые операторы сдвига для числа 42 c присвоением ( сдвигаем на 2)");

        printBinary((a >>= 2));   //10       11111111111111111111111111111100
        a = 42; // после оператора с присвоением переопределяем переменную  заданным числом
        printBinary((a >>>= 2));  //10       111111111111111111111111111100
        a = 42; // после оператора с присвоением переопределяем переменную  заданным числом
        printBinary((a <<= 2));   //168      11111111111111111111111111000100
        a = 42; // после оператора с присвоением переопределяем переменную  заданным числом
        System.out.println();


        System.out.println("Побитовые операторы сдвига для числа 15 c присвоением ( сдвигаем на 2)");

        printBinary((b >>= 2));   //3        11
        b = 15; // после оператора с присвоением переопределяем переменную  заданным числом
        printBinary((b >>>= 2));  //3        11
        b = 15; // после оператора с присвоением переопределяем переменную  заданным числом
        printBinary((b <<= 2));   //60       111100
        b = 15; // после оператора с присвоением переопределяем переменную  заданным числом
        System.out.println();


        System.out.println("Побитовые операторы сдвига для числа -42 c присвоением ( сдвигаем на 2)");

        printBinary((c >>= 2));   //-11           11111111111111111111111111110101
        c = -42; // после оператора с присвоением переопределяем переменную  заданным числом
        printBinary((c >>>= 2));  //1073741813    111111111111111111111111110101
        c = -42; // после оператора с присвоением переопределяем переменную  заданным числом
        printBinary((c <<= 2));   //-168          11111111111111111111111101011000
        c = -42; // после оператора с присвоением переопределяем переменную  заданным числом
        System.out.println();


        System.out.println("Побитовые операторы сдвига для числа -15 c присвоением ( сдвигаем на 2)");

        printBinary((d >>= 2));   //-4           11111111111111111111111111111100
        d = -15; // после оператора с присвоением переопределяем переменную  заданным числом
        printBinary((d >>>= 2));  //1073741820   111111111111111111111111111100
        d = -15; // после оператора с присвоением переопределяем переменную  заданным числом
        printBinary((d <<= 2));   //-60          11111111111111111111111111000100
        d = -15; // после оператора с присвоением переопределяем переменную  заданным числом
        System.out.println();


        // operator's  "|=" "&=" "^="

        System.out.println("Оператор AND с присвоением ");

        printBinary(a &= b);  // 10     1010   ---- a = a & b
        a = 42;
        printBinary(b &= a);  // 10     1010    ---- b = b & a
        b = 15;
        printBinary(c &= d);  // -48    11111111111111111111111111010000
        c = -42;
        printBinary(d &= c);  // -48    11111111111111111111111111010000
        d = -15;
        System.out.println();

        System.out.println("Оператор OR с присвоением ");


        printBinary(a |= b);  // 47   101111   ---- a = a | b
        a = 42;
        printBinary(b |= a);  // 47    101111    ---- b = b | a
        b = 15;
        printBinary(c |= d);  // -9    11111111111111111111111111110111
        c = -42;
        printBinary(d |= c);  // -9    11111111111111111111111111110111
        d = -15;
        System.out.println();


        System.out.println("Оператор исключающий OR с присвоением ");

        printBinary(a ^= b);  // 37   100101   ---- a = a ^ b
        a = 42;
        printBinary(b ^= a);  // 37    100101    ---- b = b ^ a
        b = 15;
        printBinary(c ^= d);  // 39    100111
        c = -42;
        printBinary(d ^= c);  // 39    100111
        d = -15;
        System.out.println();


        double e = 42.5;
        //double result = ~e;   ERROR :  Operator '~' cannot be applied to 'double'

    }
    public static void printBinary(int res){
        String binarRes = Integer.toBinaryString(res);
        System.out.println( res + " to binary : " + binarRes);
    }
}
