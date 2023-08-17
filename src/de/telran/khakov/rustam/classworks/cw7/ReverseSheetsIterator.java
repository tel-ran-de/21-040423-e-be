package de.telran.khakov.rustam.classworks.cw7;

import java.util.Iterator;
import java.util.List;

public class ReverseSheetsIterator implements Iterator<Sheet> {
    private List<Sheet> sheets;
    private int i;

    public ReverseSheetsIterator(List<Sheet> sheets) {
        this.sheets = sheets;
        this.i = sheets.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return i >= 0;
    }

    @Override
    public Sheet next() {
        Sheet current = sheets.get(i); // get()
        i--;  // go to the next
        return current;
    }
}
