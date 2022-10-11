package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rst = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rst += array[i][j];
            }
        }
        return rst;
    }
}
