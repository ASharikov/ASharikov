package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int j = array.length - 1;

        for (int i = 0; i != array.length && i < j; i++) {
            array[i] += array[j];
            array[j] = array[i] - array[j];
            array[i] = array[i] - array[j];
            j--;
        }
        return array;
    }
}
