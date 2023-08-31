package de.telran.khakov.rustam.classworks.cw10;

public class File {
    private String name;
    private String text;

    public File(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
