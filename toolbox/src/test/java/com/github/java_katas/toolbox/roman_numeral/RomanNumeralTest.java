package com.github.java_katas.toolbox.roman_numeral;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RomanNumeralTest {

    private final RomanNumeral romanNumeral = new RomanNumeral();

    @Test
    void shouldConvertNormalNumbersToRomanNumeralsI() {
        String expected = "I";
        String actual = romanNumeral.toRomanNumeral(1);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldConvertNormalNumbersToRomanNumeralsIV() {
        String expected = "IV";
        String actual = romanNumeral.toRomanNumeral(4);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldConvertNormalNumbersToRomanNumeralsXI() {
        String expected = "XI";
        String actual = romanNumeral.toRomanNumeral(11);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldConvertNormalNumbersToRomanNumeralsCMLXXXVIII() {
       String expected = "CMLXXXVIII";
        String actual = romanNumeral.toRomanNumeral(988);
        assertThat(actual, is(expected));
    }
}