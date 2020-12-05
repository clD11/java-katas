package com.github.java_katas.data_structure.map;

import org.junit.jupiter.api.Test;

class JavaHashMapTest {

    private final JavaHashMap<Integer, String> javaHashMap = new JavaHashMap<>();

    @Test
    void shouldPutValue() {
        javaHashMap.simplePut(1, "B");
        System.out.println("DONE");
    }

    @Test
    void shouldUpdateValue() {
        javaHashMap.simplePut(1, "A");
        System.out.println("DONE");
        javaHashMap.simplePut(1, "B");
        System.out.println("DONE");
    }

    @Test
    void shouldPutCollision() {
        JavaHashMap<MyKeyCollision, String> javaHashMap = new JavaHashMap<>();
        javaHashMap.simplePut(new MyKeyCollision(1), "A");
        System.out.println("DONE");
        javaHashMap.simplePut(new MyKeyCollision(2), "B");
        System.out.println("DONE");
    }

    @Test
    void shouldPutMultipleCollision() {
        JavaHashMap<MyKeyCollision, String> javaHashMap = new JavaHashMap<>();
        javaHashMap.simplePut(new MyKeyCollision(1), "A");
        System.out.println("DONE");
        javaHashMap.simplePut(new MyKeyCollision(2), "B");
        System.out.println("DONE");
        javaHashMap.simplePut(new MyKeyCollision(3), "C");
        System.out.println("DONE");
    }

    @Test
    void shouldPutMultipleCollisionAndUpdate() {
        JavaHashMap<MyKeyCollision, String> javaHashMap = new JavaHashMap<>();
        javaHashMap.simplePut(new MyKeyCollision(1), "A");
        System.out.println("DONE");
        javaHashMap.simplePut(new MyKeyCollision(2), "B");
        System.out.println("DONE");
        javaHashMap.simplePut(new MyKeyCollision(3), "C");
        System.out.println("DONE");
        // update 2
        javaHashMap.simplePut(new MyKeyCollision(2), "D");
        System.out.println("DONE");
    }

    @Test
    void shouldPutMultipleCollisionAndUpdateEnd() {
        JavaHashMap<MyKeyCollision, String> javaHashMap = new JavaHashMap<>();
        javaHashMap.simplePut(new MyKeyCollision(1), "A");
        System.out.println("DONE");
        javaHashMap.simplePut(new MyKeyCollision(2), "B");
        System.out.println("DONE");
        javaHashMap.simplePut(new MyKeyCollision(3), "C");
        System.out.println("DONE");
        // update 3
        javaHashMap.simplePut(new MyKeyCollision(3), "D");
        System.out.println("DONE");
    }

    private class MyKeyCollision {

        private Integer key;

        public MyKeyCollision(Integer key) { this.key = key; }

        public Integer getKey() { return key; }

        public int hashCode() { return 1; }

        public boolean equals(Object object) { return this.key.equals(((MyKeyCollision)object).getKey()); }
    }

}