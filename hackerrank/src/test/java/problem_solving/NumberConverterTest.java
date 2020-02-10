package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class NumberConverterTest {

    private final NumberConverter numberConverter = new NumberConverter();

    @Test
    void shouldConvertNormalNumbersToRomanNumeralsI() {
        String expected = "I";
        String actual = numberConverter.toRomanNumeral(1);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldConvertNormalNumbersToRomanNumeralsIV() {
        String expected = "IV";
        String actual = numberConverter.toRomanNumeral(4);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldConvertNormalNumbersToRomanNumeralsXI() {
        String expected = "XI";
        String actual = numberConverter.toRomanNumeral(11);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldConvertNormalNumbersToRomanNumeralsCMLXXXVIII() {
       String expected = "CMLXXXVIII";
        String actual = numberConverter.toRomanNumeral(988);
        assertThat(actual, is(expected));
    }
}