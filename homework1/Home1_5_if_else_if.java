package homework1;

import java.util.Scanner;

public class Home1_5_if_else_if {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше имя :");
        String name = in.nextLine();
        System.out.println();

        if (name.equals("Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }else if (name.equals("Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }else System.out.println("Добрый день, а вы кто?");

        in.close();
    }
}
