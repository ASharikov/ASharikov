package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int count = array.length - 1;
        for (int i = count; i >= 0; i--) {
            int countFind = 0;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    if (i != count) {
                        String tmp = array[j];
                        array[j] = array[count];
                        array[count] = tmp;
                        countFind++;
                    }
                    count--;
                }
            }
            i = i - countFind;
        }
        return Arrays.copyOf(array, count + 1);
    }
}
