package interview_preperation.warm_up_challenges;

import interview_preperation.warm_up_challenges.ImplementDivisionFunction;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ImplementDivisionFunctionTest {

    private final ImplementDivisionFunction implementDivisionFunction = new ImplementDivisionFunction();

    @Test
    void shouldDivideNumberWithNoRemainder() {
        int target = 12;
        int divisor = 4;
        int[] actual = implementDivisionFunction.divide(target, divisor);
        assertThat(actual[0], is(3));
        assertThat(actual[1], is(0));
    }

    @Test
    void shouldDivideNumberWithRemainder() {
        int target = 13;
        int divisor = 4;
        int[] actual = implementDivisionFunction.divide(target, divisor);
        assertThat(actual[0], is(3));
        assertThat(actual[1], is(1));
    }

}