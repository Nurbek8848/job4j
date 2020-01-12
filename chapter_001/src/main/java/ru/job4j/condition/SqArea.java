package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = (p / 2) / (k +1);
        double l = h * k;
        return l * h;
    }
    public static void main(String[] ars) {
        double result1 = square(4, 1);
        double result2 = square(12, 2);
        double result3 = square(6, 2);
        System.out.println("p = 4, k = 1, s = 1, real = " + result1);
        System.out.println("p = 12, k = 2, s = 8, real = " + result2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result3);
    }
}
