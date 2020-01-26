package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean result = false;
        if (ab + ac > bc && ac + bc > ab && bc + ab > ac) {
            result = true;
        }
        return result;
    }
}
