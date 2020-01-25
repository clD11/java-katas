package language_proficiency;

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

    @Test
    void shouldReturnFractionWhenHasPairs() {
        // (price * quantity) + (price * quantity) + n.. for all matched public / (price * quantity) + (price * quantity) + n.. for all matched private
        double expected = ((3 * 10) + (2 * 10)) / ((3 * 10) + (2 * 10));

        calculateFraction.onPublicTrade(3, 10, 1L);
        calculateFraction.onPublicTrade(2, 10, 1L);
        calculateFraction.onPublicTrade(11, 12, 1L);

        double priTotal = 0;
        calculateFraction.onPrivateTrade(3, 10, 1L);
        calculateFraction.onPrivateTrade(2, 10, 1L);
        calculateFraction.onPrivateTrade(12, 15, 1L);

        assertThat(calculateFraction.calculateFraction(), is(expected));
    }

}