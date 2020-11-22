package interview_preperation.arrays;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class RightRotationTest {

    private final RightRotation rightRotation = new RightRotation();

    @Test
    void shouldRotateRightOne() {
        int[] input = { 0, 1, 2, 3, 4, 5 };
        int[] expected = { 5, 0, 1, 2, 3, 4 };
        int[] actual = rightRotation.rotateRight(input, 1);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldRotateRightFull() {
        int[] input = { 0, 1, 2, 3, 4, 5 };
        int[] actual = rightRotation.rotateRight(input, 6);
        assertThat(actual, is(input));
    }

    @Test
    void shouldRotateRightFullOne() {
        int[] input = { 0, 1, 2, 3, 4, 5 };
        int[] expected = { 5, 0, 1, 2, 3, 4 };
        int[] actual = rightRotation.rotateRight(input, 7);
        assertThat(actual, is(expected));
    }

}