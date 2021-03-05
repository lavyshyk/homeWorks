package homework1;

import java.util.Scanner;

public class Home1_5_if_else_if implements ICommunicationPrinter{


    @Override
    public String welcome(String name) {
        String result = "";
        if (name.equals("Вася")){
            result = "Привет!" + "\n" + "Я тебя так долго ждал";
    }else if (name.equals("Анастасия")){
            result = "Я тебя так долго ждал";
    }else  result = "Добрый день, а вы кто?";
        return result;
    }
}
