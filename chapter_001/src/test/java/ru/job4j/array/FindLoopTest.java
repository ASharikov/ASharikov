package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {
    @Test
    public void whenTwoThenFindIndexOne() {
        FindLoop findLoop = new FindLoop();
        int rst = findLoop.indexOf(new int[] {1, 2, 3}, 2);
        int expected = 1;
        assertThat(rst, is(expected));
    }

    @Test
    public void whenFourThenNotFindIndex() {
        FindLoop findLoop = new FindLoop();
        int rst = findLoop.indexOf(new int[] {1, 2, 3}, 4);
        int expected = -1;
        assertThat(rst, is(expected));
    }
}
