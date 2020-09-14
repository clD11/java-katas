package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class AppleAndOrangeTest {

    private final AppleAndOrange appleAndOrange = new AppleAndOrange();

    @Test
    void shouldCountApplesAndOranges() {
        int[] expected = {1, 1};
        int[] actual = appleAndOrange.countApplesAndOrangesImp(7, 11, 5, 15, new int[] {-2, 2, 1}, new int[] {5, -6});
        assertThat(actual, is(expected));
    }

}