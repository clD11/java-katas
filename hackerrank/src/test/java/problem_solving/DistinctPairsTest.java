package problem_solving;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/*
    Given an int array nums and an int target, find how many unique pairs in the array such that their sum is equal to target.
    Return the number of pairs.

    Input: nums = [1, 1, 2, 45, 46, 46], target = 47
    Output: 2
    Explanation:
    1 + 46 = 47
    2 + 45 = 47

*/

class DistinctPairsTest {

    private DistinctPairs distinctPairs;

    @BeforeEach
    void beforeEach() {
        distinctPairs = new DistinctPairs();
    }

    @Test
    void shouldReturnDistinctPairsA() {
        var nums = newArrayList(5, 7, 9, 13, 11, 6, 6, 3, 3);
        var actual = distinctPairs.sum(nums, 12);
        assertThat(actual, is(3));
    }

    @Test
    void shouldReturnDistinctPairsB() {
        var nums = newArrayList(1, 1, 2, 45, 46, 46);
        var actual = distinctPairs.sum(nums, 47);
        assertThat(actual, is(2));
    }
}