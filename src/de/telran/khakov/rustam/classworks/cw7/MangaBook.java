package de.telran.khakov.rustam.classworks.cw7;

import java.util.Iterator;

public class MangaBook extends Book {
    public MangaBook(String name, String author) {
        super(name, author);
    }

    @Override
    public Iterator<Sheet> iterator() {
        return new ReverseSheetsIterator(sheets); // reversed iterator
    }
}
