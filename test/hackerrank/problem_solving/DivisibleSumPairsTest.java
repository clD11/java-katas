package hackerrank.problem_solving;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;

class DivisibleSumPairsTest {

    private final DivisibleSumPairs divisibleSumPairs = new DivisibleSumPairs();

    @Test
    void shouldReturnNumberOfDivisibleSumPairs() {
        int n = 6;
        int k = 3;
        int[] arr = { 1, 3, 2, 6, 1, 2 };

        int actual = divisibleSumPairs.divisibleSumPairs(n, k, arr);

        assertThat(actual, Matchers.is(5));
    }
}