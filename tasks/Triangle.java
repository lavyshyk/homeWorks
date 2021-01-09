package tasks;


import java.util.Scanner;

/**
 * По длинам трех отрезков, введенных пользователем, определить возможность существования треугольника,
 * составленного из этих отрезков. Если такой треугольник существует, то определить, является ли он разносторонним,
 * равнобедренным или равносторонним.
 */

public class Triangle {
    public static void main(String[] args) {
        int a, b, c;

      try (Scanner in = new Scanner(System.in)){

          System.out.println("Введите длины трех отрезков : ");
          a = in.nextInt();
          b = in.nextInt();
          c = in.nextInt();

          if (a + b > c && a + c > b && b + c > a){
              if (a != b && b != c && a != c){
                  System.out.println(" Это разносторонний треугольник");
              }else if (a == b && b == c ){
                  System.out.println("Это равносторонний треугольник");
              }else {
                  System.out.println("Это равнобедренный треугольник");
              }
          }else{
              System.out.println("Это не может быть треугольником");
          }


      }catch (Exception e){
          System.out.println(e);
      }
    }
}
