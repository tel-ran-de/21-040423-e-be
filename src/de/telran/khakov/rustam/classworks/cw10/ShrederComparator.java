package de.telran.khakov.rustam.classworks.cw10;

import java.util.Comparator;

public class ShrederComparator implements Comparator<File> {
    @Override
    public int compare(File file1, File file2) {
        return Integer.compare(file1.getName().length(), file2.getName().length());
    }
}
