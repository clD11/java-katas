package interview_preperation.arrays;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class LeftRotationTest {

    private final LeftRotation leftRotation = new LeftRotation();

    @Test
    void shouldRotateLeftA() {
        int[] a = {1, 2, 3, 4, 5};
        int d = 4;
        int[] expected = {5, 1, 2, 3, 4};
        int[] actual = leftRotation.rotLeft(a, d);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldRotateLeftB() {
        int[] a = {1, 2, 3, 4, 5};
        int d = 2;
        int[] expected = {3, 4, 5, 1, 2};
        int[] actual = leftRotation.rotLeft(a, d);
        assertThat(actual, is(expected));
    }
}