package de.telran.khakov.rustam.classworks.cw17;

public class Aircraft {
    private String name;
    private String id;
    private int createYear;

    public Aircraft(String name, int createYear) {
        this.name = name;
        this.id = IdGenerator.generate();
        this.createYear = createYear;
    }
}
