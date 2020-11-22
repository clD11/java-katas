package com.github.java_katas.random;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SortSentenceByWordsTest {

    private final SortSentenceByWords sortSentenceByWords = new SortSentenceByWords();

    @Test
    void shouldReturnSortSentenceByWords() {
        String input = "quick brown Fox";
        String expected = "Fox brown quick";
        String actual = sortSentenceByWords.execute(input);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldReturnSortSentenceByWordsCaps() {
        String input = "apple Apple";
        String expected = "Apple apple";
        String actual = sortSentenceByWords.execute(input);
        assertThat(actual, is(expected));
    }

}