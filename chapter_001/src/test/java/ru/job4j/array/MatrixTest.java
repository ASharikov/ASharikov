package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixTest {
    @Test
    public void whenFreeThenMatrixMultiplicationIndex() {
        Matrix matrix = new Matrix();
        int[][] rst = matrix.multiple(3);
        int[][] expected = {{0, 0, 0}, {0, 1, 2}, {0, 2, 4}};
        assertThat(rst, is(expected));
    }

}
