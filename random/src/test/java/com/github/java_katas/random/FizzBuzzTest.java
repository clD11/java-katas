package com.github.java_katas.random;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFizz() {
        assertThat(fizzBuzz.convertA(3), is(fizzBuzz.convertB(3)));
    }

    @Test
    void shouldReturnBuzz() {
        assertThat(fizzBuzz.convertA(5), is(fizzBuzz.convertB(5)));
    }

    @Test
    void shouldReturnFizzBuzzBoth() {
        assertThat(fizzBuzz.convertA(15), is(fizzBuzz.convertB(15)));
    }

    @Test
    void shouldReturnFizzBuzz() {
        assertThat(fizzBuzz.convertA(100), is(fizzBuzz.convertB(100)));
    }

}

