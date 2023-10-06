package de.telran.khakov.rustam.classworks.cw20;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {

    public static void main(String[] args) {
        List<Library> allLibraries = new ArrayList<>();
        List<Book> books1 = new ArrayList<>();
        books1.add(new Book("Rolling machine", 1980, "Kaein"));
        books1.add(new Book("Trains", 1930, "Kaein"));
        books1.add(new Book("Electricity", 1900, "Tesla"));
        books1.add(new Book("Light", 1890, "Eddison"));
        books1.add(new Book("Nuclear Bomb", 1949, "Opengeimer"));

        List<Book> books2 = new ArrayList<>();
        books1.add(new Book("AI", 2004, "Bill Geits"));
        books1.add(new Book("Computer Science", 1980, "Bill Geits"));
        books1.add(new Book("Internet", 1970, "Tim Lee"));
        books1.add(new Book("Phones", 2000, "Nokia Co"));
        books1.add(new Book("Electric Cars", 1909, "Tesla"));

        Library library1 = new Library(books1);
        Library library2 = new Library(books2);
        allLibraries.add(library1);
        allLibraries.add(library2);
        // пройтись по всем библиотекам и достать книги которые написаны
        // в промежутке с 50 по 90 года
        List<Book> res = new ArrayList<>();
        for (Library library : allLibraries) {
            library.getBooks()
                    .stream()
                    .filter(book -> book.publishYear >= 1950)
                    .filter(book -> book.publishYear <= 1990)
                    .collect(Collectors.toCollection(() -> res));
        }

        List<Book> res2 = allLibraries
                .stream()// Stream<Library>
                .flatMap(library -> library.getBooks().stream()) // Stream<Book>
                .filter(book -> book.publishYear >= 1950)
                .filter(book -> book.publishYear <= 1990)
                .toList();
        allLibraries
                .stream()
                .map(Library::getBooks)
                .flatMap(Collection::stream)
                .filter(book -> book.publishYear >= 1950)
                .filter(book -> book.publishYear <= 1990)
                .toList();

        System.out.println(res);
        Stream.concat(library1.getBooks().stream(), library2.getBooks().stream());
        Map<Integer, List<String>> publishYearToBooks = res
                .stream()
                .collect(Collectors.groupingBy(book -> book.publishYear,
                        Collectors.mapping(book -> book.name, Collectors.toList())
                ));
        System.out.println(publishYearToBooks);


    }
}
