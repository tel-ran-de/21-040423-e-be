package de.telran.khakov.rustam.classworks.cw10;

import java.util.Comparator;

public class CorrectFullCatComparatorVer2 implements Comparator<Cat> {

    //сравни год, если вес равен то - CatsYearComparator();
    // сравни вес, если равен то - WeightComparator();
    // сравни имя - NameCatsComparator();
    // CatsYearComparator if equals then WeightComparator if equals then NameCatsComparator
    // CatsYearComparator thenCompare WeightComparator thenCompare NameCatsComparator

    @Override
    public int compare(Cat cat1, Cat cat2) {
        Comparator<Cat> comp = new CatsYearComparator()
                .thenComparing(new WeightCatsComparator())
                .thenComparing(new NameCatsComparator());
         return comp.compare(cat1, cat2);
    }
    // cat1 2022  3  Барсик
    // cat2 2022  4  Барсик
    // cat3 2023  2
}
