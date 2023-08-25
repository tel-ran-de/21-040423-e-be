package de.telran.khakov.rustam.classworks.cw9;

import java.util.Objects;

public class Paper {
    String text;
    int length;
    int width;

    public Paper(String text, int length, int width) {
        this.text = text;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "text='" + text + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paper paper = (Paper) o;
        return length == paper.length
                && width == paper.width
                && Objects.equals(text, paper.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, length, width);
    }
}
