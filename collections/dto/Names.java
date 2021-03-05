package collections.dto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Names {
    private String name;

    public Names(String name) throws FileNotFoundException {
        this.name = name;
    }
    File file = new File("F:\\program\\JD1\\HomeWork\\src\\collections\\Names.txt");
    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
}
