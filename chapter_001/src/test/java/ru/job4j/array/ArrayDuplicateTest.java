package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] rst = arrayDuplicate.remove(new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"});
        String[] expected = {"Супер", "Мир", "Привет"};
        assertThat(rst, is(expected));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] rst = arrayDuplicate.remove(new String[] {"Привет", "Мир", "Мир", "Привет", "Мир"});
        String[] expected = {"Привет", "Мир"};
        assertThat(rst, is(expected));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate3() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] rst = arrayDuplicate.remove(new String[] {"Привет"});
        String[] expected = {"Привет"};
        assertThat(rst, is(expected));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate4() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] rst = arrayDuplicate.remove(new String[] {"Привет", "Привет"});
        String[] expected = {"Привет"};
        assertThat(rst, is(expected));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate5() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] rst = arrayDuplicate.remove(new String[] {"Привет", "Привет", "Привет"});
        String[] expected = {"Привет"};
        assertThat(rst, is(expected));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate6() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] rst = arrayDuplicate.remove(new String[] {"Привет", "Привет", "Привет", "Мир", "Мир", "Супер", "1"});
        String[] expected = {"Супер", "Мир", "Привет", "1"};
        assertThat(rst, is(expected));
    }
}
