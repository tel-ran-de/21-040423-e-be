package de.telran.khakov.rustam.classworks.cw10;

import java.util.Comparator;

public class ReverseWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        int diff = cat2.getWeight() - cat1.getWeight();
        return diff;
    }
}
