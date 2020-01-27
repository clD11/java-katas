package problem_solving;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BirthdayBarTest {

    private final BirthdayBar birthdayBar = new BirthdayBar();

    @Test
    void shouldReturnSquares() {
        List<Integer> s = newArrayList(1, 2, 1, 3, 2, 5);
        int d = 3;
        int m = 2;
        int actual = birthdayBar.birthday(s, d, m);
        assertThat(actual, is(2));
    }

    @Test
    void shouldReturnSquares55() {
        int d = 18;
        int m = 6;
        List<Integer> s = newArrayList(3, 5, 4, 1, 2, 5, 3, 4, 3, 2, 1, 1, 2, 4, 2,
                3, 4, 5, 3, 1, 2, 5, 4, 5, 4, 1, 1, 5, 3, 1, 4, 5, 2, 3, 2, 5, 2, 5, 2, 2, 1, 5, 3, 2, 5, 1, 2, 4, 3, 1, 5, 1, 3, 3, 5);
        int actual = birthdayBar.birthday(s, d, m);
        assertThat(actual, is(10));
    }

    @Test
    void shouldReturnNoSquares() {
        List<Integer> s = newArrayList(1, 2, 1, 3, 7);
        int d = 5;
        int m = 2;
        int actual = birthdayBar.birthday(s, d, m);
        assertThat(actual, is(0));
    }

    @Test
    void shouldReturnWhenDayIsGreaterThanMonth() {
        List<Integer> s = newArrayList(1, 1, 1, 1, 1, 1);
        int d = 3;
        int m = 2;
        int actual = birthdayBar.birthday(s, d, m);
        assertThat(actual, is(0));
    }

    @Test
    void shouldReturnOneWhenDayIsSameAndMonthAndSquares() {
        List<Integer> s = newArrayList(4);
        int d = 4;
        int m = 1;
        int actual = birthdayBar.birthday(s, d, m);
        assertThat(actual, is(1));
    }

}