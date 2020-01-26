package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int cell = 1;
        for (int index = 0; index < bound; index++) {
            rst[index] = cell * cell;
            cell++;
            }
        return rst;
    }
}
