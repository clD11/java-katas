package com.github.java_katas.toolbox.strings;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @Test
    void shouldReverseWords() {
        String input = "one two three";
        String expected = "three two one";
        String actual = stringUtils.reverseSentence(input);
        assertThat(actual, is(expected));
    }

}