package hanoi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlayMain {
    public static void main(String[] args) {
        Map<String,Player> map = new HashMap<>();
        Player player;
        GamePlay gamePlay = new GamePlay();
        System.out.println("          Добро пожаловать в Ханойские башни");
        System.out.println(" Правила игры : Цель этой игры заключается в перемещении колец с левой стороны на стержень " +
                "с правой стороны. Ход сосостоит в том, чтобы перенести один колец на другой стержень, с условием что" +
                " в пукт назначения он самый маленький (по размеру). Удачи! ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите имя игрока (A--z0-9)\n");
        String name = scanner.nextLine();
        if(map.containsKey(name)){
            player = map.get(name);
        }else{
            player = new Player(name, gamePlay.startGame());
        }

        System.out.println("Начало игры");
        System.out.println("игрок : " + player.name);
        System.out.println("Исходное поле");
        gamePlay.printField();

        while (!gamePlay.checkGoal()){
            System.out.println("Введите номер стержня из которого снять кольцо -> ");
            int a = scanner.nextInt();
            System.out.print("Введите номер стержня на который надо поместить кольцо -> ");
            int b = scanner.nextInt();

            boolean con = gamePlay.game(a, b);
            gamePlay.setCount();
            gamePlay.printField();
            if(!con){
                System.out.println("Переместить невозможно");
            }
        }
        System.out.println("!!!!Вы выйграли!!!!!");
        System.out.println(" Вам потребовалось " + gamePlay.getCount() + " ходов.");
        System.out.println("Ваш результат будет сохранен под именем : " + player.name);
        player.setScore(gamePlay.getCount());
        map.put(player.name, player);




    }
}
