package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] rst = new int[size][size];
        for (int i = 0; i != rst.length; i++) {
            for (int j = 0; j != rst[i].length; j++) {
                rst[i][j] = i * j;
            }
        }
        return rst;
    }
}
