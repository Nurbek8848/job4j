package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] array, int row) {
        boolean result = true;
            for (int j = 0; j < array[row].length; j++) {
                if (array[row][j] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
