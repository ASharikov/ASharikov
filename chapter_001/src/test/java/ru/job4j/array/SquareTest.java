package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SquareTest {
    @Test
    public void whenGetFourThenMassivOneToFour() {
       Square square = new Square();
       int[] rst = square.calculate(4);
       int[] expected = {1, 4, 9, 16};
        assertThat(rst, is(expected));
    }
}
