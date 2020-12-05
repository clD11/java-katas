package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SuperReduceStringImplTest {

    private final SuperReduceStringImpl superReduceString = new SuperReduceStringImpl();

    @Test
    void shouldReduceString1() {
        String s = "aaabccddd";
        String actual = superReduceString.superReducedString(s);
        assertThat(actual, is("abd"));
    }

    @Test
    void shouldReduceString2() {
        String s = "aaabccdde";
        String actual = superReduceString.superReducedString(s);
        assertThat(actual, is("abe"));
    }

    @Test
    void shouldReturnString3() {
        String input = "kagoyzkgfjnyvjewazalxngpdcfahneqoqgiyjgpzobhaghmgzmnwcmeykqzgajlmuerhhsanpdtmrzibswswzjjbjqytgfewiuu";
        String expected = "kagoyzkgfjnyvjewazalxngpdcfahneqoqgiyjgpzobhaghmgzmnwcmeykqzgajlmuersanpdtmrzibswswzbjqytgfewi";
        assertThat(superReduceString.superReducedString(input), is(expected));
    }

    @Test
    void shouldReturnString4() {
        String input = "baab";
        String expected = "Empty String";
        assertThat(superReduceString.superReducedString(input), is(expected));
    }

}