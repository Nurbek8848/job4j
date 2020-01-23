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
    public static boolean monoVertical(char[][] array, int column) {
        boolean result = true;
        for(int i = 0; i < array.length; i++ ) {
            if (array[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static char[] extractDiagonal(char[][] array) {
        char[] rsl = new char[array.length];
        for(int i = 0; i < array.length; i++) {
            rsl[i] = array[i][i];
        }
        return rsl;
    }
    public static boolean isWin(char[][] array) {
        boolean rsl = false;
        for(int i = 0; i < 5; i++) {
            if(monoHorizontal(array, i) || monoVertical(array, i)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
