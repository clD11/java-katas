package language_proficiency;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class HurdleRaceImplTest {

    private final HurdleRaceImpl hurdleRaceImpl = new HurdleRaceImpl();

    @Test
    void shouldJumpHurdlesNoDoses() {
        int k = 3;
        int[] height = { 1, 2, 3 };
        assertThat(hurdleRaceImpl.hurdleRace(k, height), is(0));
    }

    @Test
    void shouldJumpHurdles2Doses() {
        int k = 3;
        int[] height = { 1, 2, 3, 4, 5 };
        assertThat(hurdleRaceImpl.hurdleRace(k, height), is(2));
    }

}