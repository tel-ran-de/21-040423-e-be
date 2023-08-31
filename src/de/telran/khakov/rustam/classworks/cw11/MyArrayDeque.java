package de.telran.khakov.rustam.classworks.cw11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class MyArrayDeque implements Deque<Integer> {
    Integer[] array;
    int head = -1;
    int tail = -1;

    private int decreaseIndex(int index) {
        if (index == 0) {
            return array.length - 1;
        }
        return index - 1;
    }

    private int increaseIndex(int index) {
        if (index == array.length - 1) {
            return 0;
        }
        return index + 1;
    }

    private void growArray() {
        int currentSize = array.length;
        int newSize = currentSize + currentSize / 2;
        Integer[] newArray = new Integer[newSize];
        if (tail > head) {
            newArray = Arrays.copyOf(array, newSize);
        } else {
            System.arraycopy(array, 0, newArray, 0, tail);
            System.arraycopy(array, head, newArray, head + newSize - currentSize, currentSize - head);
            head = head + newSize - currentSize;
        }
        array = newArray;
    }

    @Override
    public void addFirst(Integer value) {
        if (array == null) {
            array = new Integer[10];
            head = tail = 5;
        } else {
            if (decreaseIndex(head) == tail) {
                growArray();
            }

            head = decreaseIndex(head);
        }
        array[head] = value;
    }

    @Override
    public void addLast(Integer value) {
        if (array == null) {
            array = new Integer[10];
            head = tail = 5;
        } else {
            if (head == increaseIndex(tail)) {
                growArray();
            }
            tail = increaseIndex(tail);
        }
        array[tail] = value;
    }

    @Override
    public Integer removeFirst() {
        return null;
    }

    @Override
    public Integer removeLast() {
        return null;
    }
    // 3 2 1 0 4 5 6

    @Override
    public Integer getFirst() {
        return null;
    }


    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer peek() {
        return null;
    }

    @Override
    public void push(Integer integer) {

    }

    @Override
    public Integer pop() {
        return null;
    }

    @Override
    public Integer getLast() {
        return null;
    }


    @Override
    public boolean offerFirst(Integer integer) {
        return false;
    }

    @Override
    public boolean offerLast(Integer integer) {
        return false;
    }

    @Override
    public Integer pollFirst() {
        return null;
    }

    @Override
    public Integer pollLast() {
        return null;
    }

    @Override
    public Integer peekFirst() {
        return null;
    }

    @Override
    public Integer peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(Integer integer) {
        return false;
    }

    @Override
    public boolean offer(Integer integer) {
        return false;
    }

    @Override
    public Integer remove() {
        return null;
    }

    @Override
    public Integer element() {
        return null;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
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
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
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
    public Iterator<Integer> descendingIterator() {
        return null;
    }
}
