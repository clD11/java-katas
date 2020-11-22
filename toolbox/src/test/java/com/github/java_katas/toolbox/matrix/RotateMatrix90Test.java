package com.github.java_katas.toolbox.matrix;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RotateMatrix90Test {

    private final RotateMatrix90 rotateMatrix90 = new RotateMatrix90();

    @Test
    void shouldRotateMatrix90_3() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        int[][] actual = rotateMatrix90.rotate(matrix);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldRotateMatrix90_4() {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int[][] expected = {
                { 13, 9, 5, 1 },
                { 14, 10, 6, 2 },
                { 15, 11, 7, 3 },
                { 16, 12, 8, 4 }
        };
        int[][] actual = rotateMatrix90.rotate(matrix);
        assertThat(actual, is(expected));
    }

}