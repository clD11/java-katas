package interview_preperation.warm_up_challenges;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class JumpingOnTheCloudsImplTest {

    private final JumpingOnTheCloudsImpl jumpingOnTheCloudsImpl = new JumpingOnTheCloudsImpl();

    @Test
    void shouldReachLastCloudUsingMaxJumpTwoEven() {
        int[] clouds = {0, 0, 0, 0, 0, 0, 0, 0};
        int expected = 4;
        int actual = jumpingOnTheCloudsImpl.jumpingOnTheClouds(clouds);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldReachLastCloudUsingMaxJumpTwoOdd() {
        int[] clouds = {0, 0, 0, 0, 0, 0, 0};
        int expected = 3;
        int actual = jumpingOnTheCloudsImpl.jumpingOnTheClouds(clouds);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldReachLastCloudUsingMinJumpOne() {
        int[] clouds = {0, 0, 1, 0, 1, 0, 0};
        int expected = 4;
        int actual = jumpingOnTheCloudsImpl.jumpingOnTheClouds(clouds);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldReachCloudUsingMixJumps() {
        int[] clouds = {0, 0, 1, 0, 0, 1, 0};
        int expected = 4;
        int actual = jumpingOnTheCloudsImpl.jumpingOnTheClouds(clouds);
        assertThat(actual, is(expected));
    }
}