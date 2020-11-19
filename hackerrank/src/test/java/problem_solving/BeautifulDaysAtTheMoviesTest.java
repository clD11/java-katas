package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class BeautifulDaysAtTheMoviesTest {

    private final BeautifulDaysAtTheMovies beautifulDaysAtTheMovies = new BeautifulDaysAtTheMovies();

    @Test
    void shouldReturnTwo() {
        int actual = beautifulDaysAtTheMovies.beautifulDays(20, 23, 6);
        assertThat(actual, is(2));
    }
}
