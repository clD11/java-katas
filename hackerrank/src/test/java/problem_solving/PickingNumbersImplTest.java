package problem_solving;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PickingNumbersImplTest {

    private final PickingNumbersImpl pickingNumbersImpl = new PickingNumbersImpl();

    @Test
    void shouldReturnNoResultWhenNoPairs() {
        List<Integer> a = Arrays.asList(1, 3, 6, 10, 15, 20);
        int actual = pickingNumbersImpl.pickingNumbers(a);
        assertThat(actual, is(0));
    }

    @Test
    void shouldReturnResultsWhenDifferent() {
        List<Integer> a = Arrays.asList(4, 6, 5, 3, 3, 1);
        int actual = pickingNumbersImpl.pickingNumbers(a);
        assertThat(actual, is(3));
    }

    @Test
    void shouldReturnResultsWhenAllSame() {
        List<Integer> a = Arrays.asList(66, 66, 66, 66);
        int actual = pickingNumbersImpl.pickingNumbers(a);
        assertThat(actual, is(4));
    }

}
