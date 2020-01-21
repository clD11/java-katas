package hackerrank.problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class KangarooSolutionTest {

    private final KangarooSolution kangarooSolution = new KangarooSolution();

    @Test
    void shouldReturnKangaroosCanBeAtSameLocation1() {
        String actual = kangarooSolution.kangaroo(0, 3, 4, 2);
        assertThat(actual, is("YES"));
    }

    @Test
    void shouldReturnKangaroosCantBeAtSameLocation2() {
        String actual = kangarooSolution.kangaroo(4523, 8092, 9419, 8076);
        assertThat(actual, is("YES"));
    }

    @Test
    void shouldReturnKangaroosCannotBeAtSameLocation1() {
        String actual = kangarooSolution.kangaroo(0, 2, 5, 3);
        assertThat(actual, is("NO"));
    }

    @Test
    void shouldReturnKangaroosCannotBeAtSameLocation2() {
        String actual = kangarooSolution.kangaroo(21, 6, 47, 3);
        assertThat(actual, is("NO"));
    }
}