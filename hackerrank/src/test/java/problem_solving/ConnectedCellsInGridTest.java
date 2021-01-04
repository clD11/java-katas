package problem_solving;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ConnectedCellsInGridTest {

    private final ConnectedCellsInGrid connectedCellsInGrid = new ConnectedCellsInGrid();

    @Test
    void shouldFindLargestComponent5() {
        int[][] matrix = {
                { 1, 1, 0, 0 },
                { 0, 1, 1, 0 },
                { 0, 0, 1, 0 },
                { 1, 0, 0, 0 }
        };
        int actual = connectedCellsInGrid.connectedCell(matrix);
        assertThat(actual, is(5));
    }

    @Test
    void shouldFindLargestComponent4() {
        int[][] matrix = {
                { 1, 1, 0, 0 },
                { 0, 1, 1, 0 },
                { 0, 0, 0, 0 },
                { 1, 0, 0, 1 }
        };
        int actual = connectedCellsInGrid.connectedCell(matrix);
        assertThat(actual, is(4));
    }

    @Test
    void shouldFindLargestComponentOddMatrix() {
        int[][] matrix = {
                {1, 1, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {0, 1, 0, 1, 1}
        };
        int actual = connectedCellsInGrid.connectedCell(matrix);
        assertThat(actual, is(5));
    }

    @Test
    void shouldFindLargestComponentDiagonal() {
        int[][] matrix = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}
        };
        int actual = connectedCellsInGrid.connectedCell(matrix);
        assertThat(actual, is(5));
    }

    @Test
    void shouldFindLargestComponentDiagonalMulti() {
        int[][] matrix = {
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1}
        };
        int actual = connectedCellsInGrid.connectedCell(matrix);
        assertThat(actual, is(3));
    }

    @Test
    void shouldFindLargestEight() {
        int[][] matrix = {
                {0, 0, 1, 1},
                {0, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
//        int[][] matrix = {
//                {-1, -1, 0, 1},
//                {-1, -1, 2, -1},
//                {-1, 3, 4, -1},
//                {-1, 5, 6, -1},
//                {7, 8, -1, -1}
//        };
        int actual = connectedCellsInGrid.connectedCell(matrix);
        assertThat(actual, is(8));
    }

}