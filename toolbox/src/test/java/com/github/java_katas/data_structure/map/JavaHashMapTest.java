package com.github.java_katas.data_structure.map;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class JavaHashMapTest {

    @Test
    void shouldPutValue() {
        JavaHashMap<Integer, String> map = new JavaHashMap<>();
        map.simplePut(1, "A");
        assertThat(map.get(1), is("A"));
    }

    @Test
    void shouldUpdateValue() {
        JavaHashMap<Integer, String> map = new JavaHashMap<>();
        map.simplePut(1, "A");
        assertThat(map.get(1), is("A"));
        map.simplePut(1, "B");
        assertThat(map.get(1), is("B"));
    }

    @Test
    void shouldPutCollision() {
        JavaHashMap<MyKeyCollision, String> map = new JavaHashMap<>();
        MyKeyCollision key1 = new MyKeyCollision(1);
        map.simplePut(key1, "A");
        assertThat(map.get(key1), is("A"));
        MyKeyCollision key2 = new MyKeyCollision(2);
        map.simplePut(key2, "B");
        assertThat(map.get(key2), is("B"));
    }

    @Test
    void shouldPutMultipleCollisionAndUpdate() {
        JavaHashMap<MyKeyCollision, String> map = new JavaHashMap<>();
        MyKeyCollision key1 = new MyKeyCollision(1);
        map.simplePut(key1, "A");
        MyKeyCollision key2 = new MyKeyCollision(2);
        map.simplePut(key2, "B");
        MyKeyCollision key3 = new MyKeyCollision(3);
        map.simplePut(key3, "C");
        // update 2
        map.simplePut(key2, "D");
        assertThat(map.get(key2), is("D"));
    }

    @Test
    void shouldPutMultipleCollisionAndUpdateEnd() {
        JavaHashMap<MyKeyCollision, String> map = new JavaHashMap<>();
        MyKeyCollision key1 = new MyKeyCollision(1);
        map.simplePut(key1, "A");
        MyKeyCollision key2 = new MyKeyCollision(2);
        map.simplePut(key2, "B");
        MyKeyCollision key3 = new MyKeyCollision(3);
        map.simplePut(key3, "C");
        // update 3
        map.simplePut(key3, "D");
        assertThat(map.get(key3), is("D"));
    }

    private class MyKeyCollision {

        private Integer key;

        public MyKeyCollision(Integer key) { this.key = key; }

        public Integer getKey() { return key; }

        public int hashCode() { return 1; }

        public boolean equals(Object object) { return this.key.equals(((MyKeyCollision)object).getKey()); }
    }

}