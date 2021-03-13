package homework5;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * 8. Написать новый класс с точкой входа. При запуске программы пользователь должен передать адрес папки,
 * из которой мы будет считывать текстовые файлы. После запуска пользователь указывает что он хочет найти в этом тексте.
 * После каждого ввода осуществляется поиск. Вводит пока не надоест. Поиск выполняется многопоточно. Один поток –
 * один файл. Результат всех его поисков должен накапливаться в файла result.txt в формате «Имя файла – слово – количество»
 */

public class WorkWithFilesByThreadMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder tempResultText = new StringBuilder();
        List<String> listOfFiles = new ArrayList<>();
        ExecutorService pool = Executors.newCachedThreadPool();
        File fileResult = new File("result.txt");

        System.out.println("Вееите адрес папки с файломи");
        File dir = WorkWithFilesMain.tryGetNameOfDir(scanner);   // воспользуемся статическими методами класса WorkWithFilesMain
        if(dir.isDirectory()) {
            File[] listFiles = dir.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                listOfFiles.add(listFiles[i].getPath());
                //System.out.println(listOfFiles.get(i));
            }
        }

        System.out.println("список с именами файлов сохранен");

        String word = "";

        while (!word.equals("q")) {

            System.out.println("Введите слово для поиска в тексте или \"q\" для окончания работы");
            System.out.println("-------------------------------------------------------------");
            word = WorkWithFilesMain.getStringFromCommandLine(scanner);

            if (!word.equals("q")) {
                for (String file : listOfFiles) {
                    Future<String> future = pool.submit(new FindWords(word, file));
                    try {
                        tempResultText.append(future.get()).append("\n");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }

            }

        }
        pool.shutdown();


        try (FileWriter fileWriter = new FileWriter(fileResult, fileResult.exists())) {
            fileWriter.write(String.valueOf(tempResultText));
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class FindWords implements Callable<String> {
    private String word;
    private String fileName;

    FindWords(String word, String fileName){
        this.word = word;
        this.fileName = fileName;
    }

    @Override
    public String call()  {
        String textOfFile = "";
        try {
            textOfFile = Files.readString(Path.of(String.valueOf(fileName)),
                    Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName + " - " + word + " - " + new RegExSearch().search(textOfFile, word);
    }
}
