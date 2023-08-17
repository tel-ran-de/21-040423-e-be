package de.telran.khakov.rustam.classworks.cw7;

import java.util.Objects;

public class Sheet {
    private String text;
    private int page;

    public Sheet(String text, int page) {
        this.text = text;
        this.page = page;
    }

    public String getText() {
        return text;
    }

    public int getPage() {
        return page;
    }


    @Override
    public String toString() {
        return "Sheet{" +
                "text='" + text + '\'' +
                ", page=" + page +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sheet sheet = (Sheet) o;
        return page == sheet.page && Objects.equals(text, sheet.text);
    }
}
