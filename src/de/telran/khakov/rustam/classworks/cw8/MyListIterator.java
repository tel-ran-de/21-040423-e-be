package de.telran.khakov.rustam.classworks.cw8;

import java.util.Iterator;

public class MyListIterator implements Iterator<Integer> {
    private Node current;
    public MyListIterator(Node current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Integer next() {
        Integer value = current.getValue();
        current = current.getNext();
        return value;
    }
}
