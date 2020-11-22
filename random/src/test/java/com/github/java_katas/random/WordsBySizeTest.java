package com.github.java_katas.random;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class WordsBySizeTest {

    private final WordsBySize wordsBySize = new WordsBySize();

    @Test
    void shouldReturnWordsBySize() {
        String input = "quick brown Fox";
        String expected = "Fox brown quick";
        String actual = wordsBySize.execute(input);
        assertThat(actual, is(expected));
    }

}