package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HappyLadyBugsImplTest {

    private final HappyLadyBugsImpl happyLadyBugsImpl = new HappyLadyBugsImpl();

    @Test
    void shouldReturnNOWhenOnlyOneColour() {
        String b = "X_Y__X";
        String actual = happyLadyBugsImpl.happyLadyBugs(b);
        assertThat(actual, is("NO"));
    }

    @Test
    void shouldReturnYESWhenSorted() {
        String b = "AABBCCDDD_";
        String actual = happyLadyBugsImpl.happyLadyBugs(b);
        assertThat(actual, is("YES"));
    }

    @Test
    void shouldReturnYESWhenNotSortedWithSwap() {
        String b = "AABBCCDD_D";
        String actual = happyLadyBugsImpl.happyLadyBugs(b);
        assertThat(actual, is("YES"));
    }

    @Test
    void shouldReturnYESWhenNotSortedNoSwap() {
        String b = "AABBCCEEDD";
        String actual = happyLadyBugsImpl.happyLadyBugs(b);
        assertThat(actual, is("YES"));
    }
}
