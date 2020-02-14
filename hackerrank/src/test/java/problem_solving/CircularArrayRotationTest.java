package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CircularArrayRotationTest {

    private final CircularArrayRotationImpl circularArrayRotationImpl = new CircularArrayRotationImpl();

    @Test
    void shouldRotateRightA() {
        int[] a = {3, 4, 5};
        int k = 2;
        int[] queries = { 1, 2 };
        int[] actual = circularArrayRotationImpl.circularArrayRotation(a, k, queries);
        assertThat(actual[0], is(5));
        assertThat(actual[1], is(3));
    }

}