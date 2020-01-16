package hackerrank.java;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class CalculateFractionTest {

    private final CalculateFraction calculateFraction = new CalculateFraction();

    @Test
    void shouldReturnNaNWhenNoPairTrades() {
        calculateFraction.onPublicTrade(2, 10, 1L);
        calculateFraction.onPrivateTrade(3, 10, 1L);
        assertThat(calculateFraction.calculateFraction(), is(Double.NaN));
    }

}