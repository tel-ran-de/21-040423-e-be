package de.telran.khakov.rustam.classworks.cw10;

import java.util.Comparator;

public class CorrectFullCatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        int diff = cat1.getBirthYear() - cat2.getBirthYear();
        if(diff == 0) {
            int weightDiff = cat1.getWeight() - cat2.getWeight();
            if (weightDiff == 0) {
                int nameOrder = cat1.getName().compareTo(cat2.getName());// по имени
                return nameOrder;
            } else {
                return weightDiff;
            }
        } else {
            return diff;
        }
    }
    // cat1 2022  3  Барсик
    // cat2 2022  4  Барсик
    // cat3 2023  2
}
