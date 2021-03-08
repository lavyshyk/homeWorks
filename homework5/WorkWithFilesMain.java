package homework5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
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
        String nameDir = "";
        File dir;
        boolean flag;

        do{
            dir = new File(getStringFromCommandLine(scanner));
            if(!dir.exists()){
                System.out.println("Неправильное имя или файла не существует.\nBведите еще раз ---->");
                flag = true;
            }else{
                flag = false;
            }
        }while (flag);

        if(dir.isDirectory()) {
            File[] listFiles = dir.listFiles();
            for (File file : listFiles) {
                System.out.println(file);
            }
        }
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Выберите файл для работы");
        String enter = getStringFromCommandLine(scanner);

        File fileName = new File(enter);

        String text = "";

        long contWord = 0;
        try {
            text = Files.readString(Path.of(String.valueOf(fileName)),
                    Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Файл найден и готов к работе  ");
        String word = "";
        while (!word.equals("q")){
            System.out.println("Введите слово для поиска в тексте или q для окончания работы");
            System.out.println("-------------------------------------------------------------");
            word = getStringFromCommandLine(scanner);
            if(!word.equals("q")) {
                RegExSearch search = new RegExSearch();
                contWord = search.search(text, word);
                File fileResult = new File("result.txt");

                try (FileWriter fileWriter = new FileWriter(fileResult, fileResult.exists())) {
                    fileWriter.write(fileName.getName() + " - " + word + " - " + contWord + "\n");
                    fileWriter.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     *
     * @param scanner
     * @return String  - введенная пользователем строка
     */
    public static String getStringFromCommandLine(Scanner scanner) {
        return scanner.nextLine();
    }



}
