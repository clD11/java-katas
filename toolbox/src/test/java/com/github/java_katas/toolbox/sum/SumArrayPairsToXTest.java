package com.github.java_katas.toolbox.sum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SumArrayPairsToXTest {

    // Given two unsorted arrays, find all pairs whose sum is x

    private final SumArrayPairsToX sumArrayPairsToX = new SumArrayPairsToX();

    @Test
    void shouldSumPairsA() {
        int[] arr1 = {-1, -2, 4, -6, 5, 7};
        int[] arr2 = {6, 3, 4, 0};
        List<List<Integer>> expected = List.of(List.of(3, 5), List.of(4, 4));
        List<List<Integer>> actual = sumArrayPairsToX.sum(arr1, arr2, 8);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldSumPairsB() {
        int[] arr1 = {1, 2, 4, 5, 7};
        int[] arr2 = {5, 6, 3, 4, 8};
        List<List<Integer>> expected = List.of(List.of(5, 4), List.of(4, 5), List.of(8, 1));
        List<List<Integer>> actual = sumArrayPairsToX.sum(arr1, arr2, 9);
        assertThat(actual, is(expected));
    }

}