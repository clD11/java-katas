package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BreakingRecordsTest {

    private final BreakingRecordsImpl breakingRecordsimpl = new BreakingRecordsImpl();

    @Test
    void shouldReturnLowestScore() {
        int[] scores = { 4, 2, 5, 2, 20, 1 };
        int[] actual = breakingRecordsimpl.breakingRecords(scores);
        assertThat(actual[1], is(2));
    }

    @Test
    void shouldReturnHighestScore() {
        int[] scores = { 2, 4, 19, 15, 20, 20 };
        int[] actual = breakingRecordsimpl.breakingRecords(scores);
        assertThat(actual[0], is(3));
    }

}