package de.telran.khakov.rustam.classworks.cw10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileShreder {

    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        files.add(new File("Harry Potter", "Some text about Harry"));
        files.add(new File("Draft", "Some draft text about Harry"));
        files.add(new File("Any text", "Lorem ipsum "));
        files.add(new File("Spam", "You won a lottery"));
        Collections.sort(files, new ShrederComparator());
        System.out.println(files);
    }
}
