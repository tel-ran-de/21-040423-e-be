package de.telran.khakov.rustam.classworks.cw8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List<Integer> {
    Integer[] array = new Integer[0];
    int originalSize = 0;
    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add(Integer value) {
        // add new value
        // increase array size -> Arrays.copyOf();
        return false;
    }

    @Override
    public boolean contains(Object o) {
        // for ->
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        //
        return null;
    }

    @Override
    public boolean remove(Object o) {
        // 2  -> 5
        // {5,6,3,2,1}
        // {5,6}{2,1} -> Arrays.copyOf()
        return false;
    }

    @Override
    public Integer get(int index) {
        //
        return null;
    }

    @Override
    public Integer set(int index, Integer element) {
        return null;
    }

    @Override
    public void add(int index, Integer element) {
        // 2  ->
        //Arrays.copyOf()
        // {5,6}<val>{3,2,1}
        // {5,6,3,2,1}
        // {5,6}{2,1} -> Arrays.copyOf()
    }

    @Override
    public Integer remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }
}
