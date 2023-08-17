package de.telran.khakov.rustam.classworks.cw7;

import java.util.List;

public class BookTest {

    public static void main(String[] args) {
        Book book = new MangaBook("Harry Potter", "J. Rouling");
        book.addPage("first page text");
        book.addPage("something happend");
        book.addPage("something happend again");
        book.addPage("end of episode");
        book.addPage("Hagrid is come");
        book.addPage("I am Harry");
        // пройтись по всем страницам книги
        for (Sheet sheet: book) {
            System.out.println(sheet);
        }
        // for -> while ->
        // init()- constructor   ->
        // check - hasNext()  ->
        // getNext - next();

//        List<Sheet> sheets = book.getSheets();
//        int i = sheets.size() - 1;//  iterator = book.iterator();
//        while (i >= 0) { // iterator.hasNext();
//            Sheet current = sheets.get(i); // get()  iterator.next();
//            i--;  // go to the next
//            System.out.println(current);
//        }

    }
}
