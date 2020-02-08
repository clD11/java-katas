package interview_preperation.warm_up_challenges;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RepeatedStringImplTest {

    private final RepeatedStringImpl repeatedStringImpl = new RepeatedStringImpl();

    @Test
    void shouldReturnValueForSingleRepeatedA() {
        String s = "a";
        long n = 10;
        long actual = repeatedStringImpl.repeatedString(s, n);
        assertThat(actual, is(10L));
    }

    @Test
    void shouldReturnValueForSingleRepeatedEvenNumberOfTimes() {
        String s = "aa";
        long n = 10;
        long actual = repeatedStringImpl.repeatedString(s, n);
        assertThat(actual, is(10L));
    }

    @Test
    void shouldReturnValueForSingleRepeatedOddNumberOfTimes() {
        String s = "aaa";
        long n = 10;
        long actual = repeatedStringImpl.repeatedString(s, n);
        assertThat(actual, is(10L));
    }

    @Test
    void shouldReturnValueForSingleRepeatedOddNumberOfTimesMix() {
        String s = "aba";
        long n = 10;
        long actual = repeatedStringImpl.repeatedString(s, n);
        assertThat(actual, is(7L));
    }
}