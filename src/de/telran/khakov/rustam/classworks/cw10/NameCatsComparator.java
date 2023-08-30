package de.telran.khakov.rustam.classworks.cw10;

import java.util.Comparator;

public class NameCatsComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getName().compareTo(cat2.getName());
    }
}
