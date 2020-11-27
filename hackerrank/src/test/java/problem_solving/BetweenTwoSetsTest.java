package problem_solving;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BetweenTwoSetsTest {

    private final BetweenTwoSets betweenTwoSets = new BetweenTwoSets();

    @Test
    void shouldGetGCDList() {
        assertThat(betweenTwoSets.getGreatestCommonFactor(List.of(24, 60)), is(12));
    }

    @Test
    void shouldGetTotalXA() {
        assertThat(betweenTwoSets.getTotalX(List.of(2, 4), List.of(16, 32, 96)), is(3));
    }

//    @Test
//    void shouldGetTotalXB() { assertThat(betweenTwoSets.getTotalX(List.of(3, 6, 9), List.of(36, 72)), is(2)); }

}