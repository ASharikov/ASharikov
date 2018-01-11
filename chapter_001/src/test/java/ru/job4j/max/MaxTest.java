package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
   @Test
    public void whenMaxBetweenTwoAndThreeThenThree() {
        Max max = new Max();
        int result = max.max(2, 3);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMaxBetweenTwoSevenAndThreeThenSeven() {
        Max max = new Max();
        int result = max.max(2, 7, 3);
        int expected = 7;
        assertThat(result, is(expected));
    }
}
