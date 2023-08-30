package de.telran.khakov.rustam.classworks.cw10;

import java.util.Comparator;

public class CatsYearComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare(cat1.getBirthYear(), cat2.getBirthYear());
    }
}
