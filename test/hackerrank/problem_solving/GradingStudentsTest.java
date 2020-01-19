package hackerrank.problem_solving;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class GradingStudentsTest {

    private final List<Integer> grades = Lists.newArrayList(4, 73, 67, 38, 33);
    private final List<Integer> expected = Lists.newArrayList(4, 75, 67, 40, 33);

    private final GradingStudents gradingStudents = new GradingStudents();

    @Test
    void shouldGradeStudent() {
        List<Integer> actual = gradingStudents.gradingStudents(grades);
        assertThat(actual, is(expected));
    }

    @Test
    void shouldGradeStudentMap() {
        List<Integer> actual = gradingStudents.gradingStudentsMap(grades);
        assertThat(actual, is(expected));
    }
}