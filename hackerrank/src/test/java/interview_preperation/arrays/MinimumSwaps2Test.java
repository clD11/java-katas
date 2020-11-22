package interview_preperation.arrays;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

    /*

        You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates.
        You are allowed to swap any two elements.
        You need to find the minimum number of swaps required to sort the array in ascending order.

     */

class MinimumSwaps2Test {

    private final MinimumSwaps2 minimumSwaps2 = new MinimumSwaps2();

    @Test
    void shouldCountMinimumSwapsA() {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        int actual = minimumSwaps2.minimumSwaps(arr);
        assertThat(actual, is(5));
    }

    @Test
    void shouldCountMinimumSwapsB() {
        int[] arr = {2, 3, 4, 1, 5};
        int actual = minimumSwaps2.minimumSwaps(arr);
        assertThat(actual, is(3));
    }

    @Test
    void shouldCountMinimumSwapsC() {
        int[] arr = {1, 3, 5, 2, 4, 6, 7};
        int actual = minimumSwaps2.minimumSwaps(arr);
        assertThat(actual, is(3));
    }

    @Test
    void shouldCountMinimumSwapsD() {
        int[] arr = {8, 45, 35, 84, 79, 12, 74, 92, 81, 82, 61, 32, 36, 1, 65, 44, 89, 40, 28, 20, 97, 90, 22, 87, 48,
                26, 56, 18, 49, 71, 23, 34, 59, 54, 14, 16, 19, 76, 83, 95, 31, 30, 69, 7, 9, 60, 66, 25, 52, 5, 37,
                27, 63, 80, 24, 42, 3, 50, 6, 11, 64, 10, 96, 47, 38, 57, 2, 88, 100, 4, 78, 85, 21, 29, 75, 94, 43, 77,
                33, 86, 98, 68, 73, 72, 13, 91, 70, 41, 17, 15, 67, 93, 62, 39, 53, 51, 55, 58, 99, 46};
        int actual = minimumSwaps2.minimumSwaps(arr);
        assertThat(actual, is(91));
    }



    @Test
    void shouldSwapValuesInArray() {
        int[] arr = {3, 2, 1};
        int[] actual = minimumSwaps2.swap(arr, 0, 2);
        assertThat(actual[0], is(1));
        assertThat(actual[2], is(3));
    }
}