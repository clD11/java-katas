package com.github.java_katas.toolbox.frequency;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

class StringFrequencyTest {

    private final StringFrequency stringFrequency = new StringFrequency();

    @Test
    void shouldFindFrequencyMultiple() {
        List<String> input = List.of("apple", "apple", "orange", "orange", "pear");
        Map<String, Integer> expected = Map.of("apple", 2, "orange", 2, "pear", 1);
        Map<String, Integer> actual = stringFrequency.findFrequency(input);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldFindFrequencySingle() {
        List<String> input = List.of("apple");
        Map<String, Integer> expected = Map.of("apple", 1);
        Map<String, Integer> actual = stringFrequency.findFrequency(input);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldFindFrequencyTopThree() {
        List<String> input = List.of("apple", "apple", "apple", "apple", "orange", "orange", "orange", "pear", "pear", "tomato");
        List<String> expected = List.of("apple", "orange", "pear");
        List<String> actual = stringFrequency.findFrequency(input, 3);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldFindFrequencyTop() {
        List<String> input = List.of("apple", "apple", "apple", "orange", "orange", "pear", "pear", "tomato", "onion");
        List<String> expected = List.of("apple");
        List<String> actual = stringFrequency.findFrequency(input, 1);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldFindFrequencyTopMoreThanItems() {
        List<String> input = List.of("apple", "apple", "apple", "orange", "orange", "pear");
        List<String> expected = List.of("apple", "orange", "pear");
        List<String> actual = stringFrequency.findFrequency(input, 7);
        assertThat(actual, is(expected));
    }

}