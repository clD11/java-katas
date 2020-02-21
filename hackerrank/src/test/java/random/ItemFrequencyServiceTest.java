package random;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ItemFrequencyServiceTest {

    private final ItemFrequencyService itemFrequencyService = new ItemFrequencyService();

    @Test
    void shouldGetTopNames() {
        var names = itemFrequencyService.getTopName("names.txt", 3);
        assertThat(names.size(), is(3));
        assertThat(names.get(0), is("Joe Blogs"));
        assertThat(names.get(1), is("Billy"));
        assertThat(names.get(2), is("Anna"));
    }

}