package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int count = array.length - 1;
        for (int i = 0; i < count - i; i++) {
            array[i] += array[count - i];
            array[count - i] = array[i] - array[count - i];
            array[i] = array[i] - array[count - i];
        }
        return array;
    }
}
