package homework1;

import java.util.Scanner;

public class Home1_5_switch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше имя :");
        String name = in.nextLine();
        System.out.println();

       switch (name){
           case "Вася" :
               System.out.println("Привет!");
           case "Анастасия":
               System.out.println("Я тебя так долго ждал");
               break;
           default:
               System.out.println("Добрый день, а вы кто?");
       }

       in.close();
    }
}
