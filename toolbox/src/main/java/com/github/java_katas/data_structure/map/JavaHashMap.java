package com.github.java_katas.data_structure.map;

import java.util.Objects;

public class JavaHashMap <K, V> {

    private Node<K, V>[] table = new Node[16];

    public V simplePut(K key, V value) {
        int hashcode = key.hashCode();
        Node<K, V> node = table[hashcode];
        if (node == null) {
            table[hashcode] = new Node<>(hashcode, key, value, null);
        } else if (node.key.equals(key)) {
            node.setValue(value);
        } else if (node != null && !node.key.equals(key)) {
            if (node.next == null) {
                node.next = new Node<>(hashcode, key, value, null);
            } else {
                Node<K, V> nextNode = node.next;
                while (nextNode.next != null) {
                    if (nextNode.key.equals(key)) {
                        nextNode.setValue(value);
                        return value;
                    }
                    nextNode = nextNode.next;
                }
                // check last node
                if (nextNode.key.equals(key)) {
                    nextNode.setValue(value);
                } else {
                    nextNode.next = new Node<>(hashcode, key, value, null);
                }
            }
        }
        return value;
    }

    public V get(K key) {
        int hashcode = Objects.hashCode(key);
        Node<K, V> node = table[hashcode];

        if (node.key.equals(key)) {
            return node.value;
        }

        node = node.next;
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }

        return null;
    }

    private final class Node<K, V> {

        private final int hash;
        private final K key;
        private V value;
        private Node next;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return key.equals(node.key) &&
                    value.equals(node.value);
        }
    }

}