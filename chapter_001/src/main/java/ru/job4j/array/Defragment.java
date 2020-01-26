package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
               int point = index;
                for (point = point+1; point < array.length; point++) {
                    if (array[point] != null) {
                        String temp = array[index];
                        array[index] = array[point];
                        array[point] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
