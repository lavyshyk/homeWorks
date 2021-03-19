package homework1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToBinaryStringTest {
    Home1_7 obj = new Home1_7();


    @Test
    public void toBinaryStringTest(){
                Assertions.assertEquals("00001111", obj.toBinaryString((byte) 15));
                Assertions.assertEquals("11110001", obj.toBinaryString((byte) -15));
                Assertions.assertEquals("00101010", obj.toBinaryString((byte) 42));
                Assertions.assertEquals("11010110", obj.toBinaryString((byte) -42));

        }

}
