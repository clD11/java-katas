package language_proficiency;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class IfElseTest {

    private final IfElse ifElse = new IfElse();

    @Test
    void shouldReturnNotWeird() {
        assertThat(ifElse.task(24), is("Not Weird"));
    }

}