package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = MinRange.findMin(array, i, array.length);
            int index = FindLoop.indexOf(array, min, i, array.length);
            min = array[index];
            array[index] = array[i];
            array[i] = min;
        }
        return array;
    }
}
