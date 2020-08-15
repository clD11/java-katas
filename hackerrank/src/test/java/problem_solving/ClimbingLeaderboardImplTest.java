package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ClimbingLeaderboardImplTest {

    private final int[] scores = { 100, 100, 50, 40, 40, 20, 10 };
    private final ClimbingLeaderboardImpl climbingLeaderboardImpl = new ClimbingLeaderboardImpl();

    @Test
    void shouldBeFirst() {
        int[] alice = { 120 };
        int[] expected = { 1 };
        assertThat(climbingLeaderboardImpl.climbingLeaderboard(scores, alice), is(expected));
    }

    @Test
    void shouldBeFirstEqual() {
        int[] alice = { 100 };
        int[] expected = { 1 };
        assertThat(climbingLeaderboardImpl.climbingLeaderboard(scores, alice), is(expected));
    }

    @Test
    void shouldBeSecond() {
        int[] alice = { 75 };
        int[] expected = { 2 };
        assertThat(climbingLeaderboardImpl.climbingLeaderboard(scores, alice), is(expected));
    }

    @Test
    void shouldBeSecondEqual() {
        int[] alice = { 50 };
        int[] expected = { 2 };
        assertThat(climbingLeaderboardImpl.climbingLeaderboard(scores, alice), is(expected));
    }

    @Test
    void shouldBeFourth() {
        int[] alice = { 25 };
        int[] expected = { 4 };
        assertThat(climbingLeaderboardImpl.climbingLeaderboard(scores, alice), is(expected));
    }

    @Test
    void shouldBeRankedLast() {
        int[] alice = { 5 };
        int[] expected = { 6 };
        assertThat(climbingLeaderboardImpl.climbingLeaderboard(scores, alice), is(expected));
    }

    @Test
    void shouldBeRankedLastEqual() {
        int[] alice = { 10 };
        int[] expected = { 5 };
        assertThat(climbingLeaderboardImpl.climbingLeaderboard(scores, alice), is(expected));
    }

    @Test
    void shouldReturnRanks() {
        int[] alice = { 5, 25, 50, 120 };
        int[] expected = { 6, 4, 2, 1 };
        assertThat(climbingLeaderboardImpl.climbingLeaderboard(scores, alice), is(expected));
    }
}