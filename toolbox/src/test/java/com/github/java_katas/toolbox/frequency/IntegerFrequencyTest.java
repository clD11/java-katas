package com.github.java_katas.toolbox.frequency;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class IntegerFrequencyTest {

    private final IntegerFrequency integerFrequency = new IntegerFrequency();

    @Test
    void shouldGetFrequencyOfIntegersMultiple() {
        List<Integer> input = List.of(1, 1, 1, 2, 2, 2, 8, 9);
        Map<Integer, Integer> expected = Map.of(1, 3, 2, 3, 8, 1, 9, 1);
        Map<Integer, Integer> actual = integerFrequency.findFrequency(input);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldGetFrequencyOfIntegersSingle() {
        List<Integer> input = List.of(1);
        Map<Integer, Integer> expected = Map.of(1, 1);
        Map<Integer, Integer> actual = integerFrequency.findFrequency(input);
        assertThat(actual, is(expected));
    }

}