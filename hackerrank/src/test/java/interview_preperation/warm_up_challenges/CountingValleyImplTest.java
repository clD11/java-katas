package interview_preperation.warm_up_challenges;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class CountingValleyImplTest {

    private final CountingValleyImpl countingValleyImpl = new CountingValleyImpl();

    @Test
    void shouldBeOneValley() {
        String steps = "UDDDUDUU";
        var actual = countingValleyImpl.countingValleys(steps.length(), steps);
        assertThat(actual, is(1));
    }

    @Test
    void shouldBeNoValley() {
        String steps = "UDUDUDUD";
        var actual = countingValleyImpl.countingValleys(steps.length(), steps);
        assertThat(actual, is(0));
    }

    @Test
    void shouldBeThreeValley() {
        String steps = "DUDUDU";
        var actual = countingValleyImpl.countingValleys(steps.length(), steps);
        assertThat(actual, is(3));
    }

}