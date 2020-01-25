package problem_solving;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;


import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.MatcherAssert.assertThat;

class MigratoryBirdsTest {

    private final MigratoryBirds migratoryBirds = new MigratoryBirds();

    @Test
    void shouldReturnBirdSightings() {
        List<Integer> input = newArrayList( 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4 );
        int actual = migratoryBirds.countMigratoryBirds(input);
        assertThat(actual, Matchers.is(3));
    }

}