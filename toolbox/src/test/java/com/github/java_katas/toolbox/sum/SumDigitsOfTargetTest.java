package com.github.java_katas.toolbox.sum;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SumDigitsOfTargetTest {

    private final SumDigitsOfTarget sumDigitsOfTarget = new SumDigitsOfTarget();

    @Test
    void shouldSumDigits() {
        int input = 687;
        int actual = sumDigitsOfTarget.sum(input);
        assertThat(actual, is(21));
    }

}