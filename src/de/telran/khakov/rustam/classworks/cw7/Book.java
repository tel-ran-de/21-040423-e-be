package de.telran.khakov.rustam.classworks.cw7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book implements Iterable<Sheet> {
    protected List<Sheet> sheets;// null
    private String name; // name
    private String author; // author

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.sheets = new ArrayList<>();
    }

    public int size() {
        return sheets.size();
    }

    public void addPage(String text) {
        this.sheets.add(new Sheet(text, this.sheets.size() + 1));
    }

    public List<Sheet> getSheets() {
        return sheets;
    }

    @Override
    public Iterator<Sheet> iterator() {
        return sheets.iterator();
    }
}
