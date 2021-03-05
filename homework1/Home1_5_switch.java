package homework1;

import java.util.Scanner;

public class Home1_5_switch implements ICommunicationPrinter {
   //public static void main(String[] args) {
   //
   //    Scanner in = new Scanner(System.in);
   //    System.out.print("Введите Ваше имя :");
   //    String name = in.nextLine();
   //    System.out.println();
   //
   //
   //
   //   in.close();
   //}

    @Override
    public String welcome(String name) {
        String result = "";
        switch (name){
        case "Вася" :
            result = "Привет!" + "\n" + "Я тебя так долго ждал";
            break;
        case "Анастасия":
            result = "Я тебя так долго ждал";
            break;
        default:
            result = "Добрый день, а вы кто?";;
    }
        return result;
    }
}
