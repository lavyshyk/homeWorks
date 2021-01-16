package homework1.tasks;

import java.util.Scanner;

/**
 * Вводятся координаты (x;y) точки и радиус круга (r). Определить принадлежит ли данная точка кругу,
 * если его центр находится в начале координат.
 */

public class PointInCircle {

    public static void main(String[] args) {

        int x, y, r;


        Scanner in = new Scanner(System.in);

        System.out.println("Координаты точки x, y :");
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("Радиус окружности r : ");
        r = in.nextInt();

        double res =  Math.sqrt(x* x * 0.1 + y * y );

        if (r >= res){
            System.out.println("Точка принадлежит кругу");
        }else {
            System.out.println("Точка не принадлежит кругу");
        }

        in.close();
    }
}
