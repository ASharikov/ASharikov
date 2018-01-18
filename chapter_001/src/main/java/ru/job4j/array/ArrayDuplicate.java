package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int countDub = 0;
        for (int i = 0; i < array.length - countDub - 1; i++) {
            for (int j = 0; j < array.length - countDub; j++) {
                if (array[i] == array[j + 1]) {
                    String tmp = array[j + 1];
                    array[j + 1] = array[array.length - 1 - countDub];
                    array[array.length - 1 - countDub] = tmp;
                    countDub++;
                }
            }
        }
        return Arrays.copyOf(array, array.length - countDub);
    }
}
