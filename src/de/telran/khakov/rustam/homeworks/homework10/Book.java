package de.telran.khakov.rustam.homeworks.homework10;

/**
 * - по году публикации
 * - по автору
 * - по названию
 * - по издательству
 * - в порядке возрастания имени, но убывания по автору
 */
public class Book {
    private int publishYear;
    private String author; // Author author
    private String name;
    private String publishHome;// PublishHome publishHome

    public Book(int publishYear, String author, String name, String publishHome) {
        this.publishYear = publishYear;
        this.author = author;
        this.name = name;
        this.publishHome = publishHome;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getPublishHome() {
        return publishHome;
    }

    @Override
    public String toString() {
        return "Book{" +
                "publishYear=" + publishYear +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", publishHome='" + publishHome + '\'' +
                '}';
    }
}
