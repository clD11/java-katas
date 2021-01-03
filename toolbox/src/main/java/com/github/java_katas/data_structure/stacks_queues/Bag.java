package com.github.java_katas.data_structure.stacks_queues;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<T> implements Iterable<T> {
    private Node<T> first;    // beginning of bag
    private int n;               // number of elements in bag

    // helper linked list class
    private static class Node<T> {
        private T obj;
        private Node<T> next;
    }

    /**
     * Initializes an empty bag.
     */
    public Bag() {
        first = null;
        n = 0;
    }

    /**
     * Returns true if this bag is empty.
     *
     * @return {@code true} if this bag is empty;
     * {@code false} otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of Ts in this bag.
     *
     * @return the number of Ts in this bag
     */
    public int size() {
        return n;
    }

    /**
     * Adds the T to this bag.
     *
     * @param obj the T to add to this bag
     */
    public void add(T obj) {
        Node<T> oldfirst = first;
        first = new Node<T>();
        first.obj = obj;
        first.next = oldfirst;
        n++;
    }


    /**
     * Returns an iterator that iterates over the Ts in this bag in arbitrary order.
     *
     * @return an iterator that iterates over the Ts in this bag in arbitrary order
     */
    public Iterator<T> iterator() {
        return new LinkedIterator(first);
    }

    // an iterator, doesn't implement remove() since it's optional
    private class LinkedIterator implements Iterator<T> {
        private Node<T> current;

        public LinkedIterator(Node<T> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T T = current.obj;
            current = current.next;
            return T;
        }
    }

}