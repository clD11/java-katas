package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class AngryProfessorImplTest {

    private final AngryProfessorImpl angryProfessorImpl = new AngryProfessorImpl();

    @Test
    void shouldReturnClassCancelled() {
        int k = 3;
        int[] a = {-1, -3, 4, 2};
        String actual = angryProfessorImpl.angryProfessor(a, k);
        assertThat(actual, is("YES"));
    }

    @Test
    void shouldReturnClassNotCancelled() {
        int k = 2;
        int[] a = {0, -1, 2, 1};
        String actual = angryProfessorImpl.angryProfessor(a, k);
        assertThat(actual, is("NO"));
    }

}