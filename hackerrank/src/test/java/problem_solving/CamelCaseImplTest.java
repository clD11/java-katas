package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CamelCaseImplTest {

    @Test
    void shouldCountWordsByCamelCase() {
        int expected = 5;
        int actual = CamelCaseImpl.camelCase("saveChangesInTheEditor");
        assertThat(actual, is(expected));
    }

}