package homework5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Далее задания выполнять только после прохождения темы "Работа с файлами"
 * 7. Написать новый класс с точкой входа. При запуске программы пользователь должен передать адрес папки,
 * из которой мы будет считывать текстовые файлы. Наполнить данную директорию книгами, 100 книг мнинимум.
 * При запуске пользователю в консоль выдать список txt файлов и предложить выбрать текст, с которым мы будем работать.
 * Пользователь, выбрав текст вводит то, что он хочет найти в этом тексте. После каждого ввода осуществляется поиск.
 * Вводит пока не надоест. Результат всех его поисков должен накапливаться в файла result.txt
 * в формате «Имя файла – слово – количество»
 */

public class WorkWithFilesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вееите адрес папки с файломи");
        String nameDir = scanner.nextLine();

        File dir = new File(nameDir);
       if(dir.isDirectory()){
           File[] files = dir.listFiles();
           for (File file : files) {
               System.out.println(file.getName());
           }
       }

        System.out.println("Выберите файл для работы  или q для окончания работы");
        String enter = scanner.nextLine();
       File fileName = new File(enter);


           System.out.println("Файл найден и готов к работе \n " +
                   "Введите слово для поиска в тексте");
           String word = scanner.nextLine();
           long contWord = 0;
           try {RegExSearch search = new RegExSearch();
               String text =Files.readString(
                       Path.of(fileName.getAbsolutePath()));
                contWord = search.search(text,word);
           } catch (IOException e) {
               e.printStackTrace();
           }
           
           try (FileWriter fileWriter = new FileWriter("result.txt")){
               fileWriter.write(fileName + " - " + word + " - " + contWord);
               fileWriter.flush();
           } catch (IOException e) {
               e.printStackTrace();
           }


    }

}
