package problem_solving;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BetweenTwoSetsTest {

    private final BetweenTwoSets betweenTwoSets = new BetweenTwoSets();

    @Test
    void shouldGetPrimeFactorA() {
        List<Integer> expected = List.of(2, 2, 3, 3);
        List<Integer> actual = betweenTwoSets.getPrimeFactors(36);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldGetPrimeFactorB() {
        List<Integer> expected = List.of(2, 3, 7);
        List<Integer> actual = betweenTwoSets.getPrimeFactors(42);
        assertThat(actual, is(expected));
    }

}