package problem_solving;

import org.junit.jupiter.api.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class DistinctPairsTest {

    private final DistinctPairs distinctPairs = new DistinctPairs();

    @Test
    void shouldReturnDistinctPairsA() {
        var nums = newArrayList(5, 7, 9, 13, 11, 6, 6, 3, 3);
        var actual = distinctPairs.sum(nums, 12);
        assertThat(actual, is(3));
    }

    @Test
    void shouldReturnSumDistinctPairs() {
        var nums = newArrayList(1, 1, 2, 45, 46, 46);
        var actual = distinctPairs.sum(nums, 47);
        assertThat(actual, is(2));
    }
}