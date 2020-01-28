package ru.job4j.sort;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (j >= left.length) {
                rsl[i] = right[k];
                k++;
            } else if (k >= right.length) {
                rsl[i] = left[j];
                j++;
            } else if (left[j] < right[k]) {
                rsl[i] = left[j];
                j++;
            } else {
                rsl[i] = right[k];
                k++;
            }
        }
        return rsl;
    }
}
