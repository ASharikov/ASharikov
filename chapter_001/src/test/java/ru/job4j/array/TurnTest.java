package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TurnTest {
    @Test
    public void whenGetNotEvenMasThenInverseMas() {
        Turn turn = new Turn();
        int[] rst = turn.back(new int[] {1, 2, 3, 4, 5});
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(rst, is(expected));
    }

    @Test
    public void whenGetEvenMasThenInverseMas() {
        Turn turn = new Turn();
        int[] rst = turn.back(new int[] {4, 1, 6, 2});
        int[] expected = {2, 6, 1, 4};
        assertThat(rst, is(expected));
    }
}
