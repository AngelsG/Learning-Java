package com.company;

import org.junit.Test;

import static com.company.Main.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MainTest {

    int RETURN_VALUE_WHEN_BIG_RESULT = -1;

    @Test
    public void multiplied_by_three() {
        assertThat(multiplyBy3(0), equalTo(0));
        assertThat(multiplyBy3(2), equalTo(6));

        assertThat(multiplyBy3(3), equalTo(9));
    }

    @Test
    public void cannot_multiply_by_three_when_obtaining_a_big_result() {
        assertThat(multiplyBy3(4), equalTo(RETURN_VALUE_WHEN_BIG_RESULT));
        assertThat(multiplyBy3(5), equalTo(RETURN_VALUE_WHEN_BIG_RESULT));
        assertThat(multiplyBy3(100), equalTo(RETURN_VALUE_WHEN_BIG_RESULT));
    }
}
