package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class TwoCharactersTest {

    private final TwoCharacters twoCharacters = new TwoCharacters();

    @Test
    void shouldCreateString() {
        String input = "beabeefeab";
        int expected = 5;
        assertThat(twoCharacters.alternate(input), is(expected));
    }

}